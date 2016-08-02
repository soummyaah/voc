from unittest import expectedFailure

from ..utils import TranspileTestCase


class WhileLoopTests(TranspileTestCase):
    def test_while(self):
        self.assertCodeExecution("""
            i = 0
            total = 0
            while i < 10:
                i += 1
                total += i
                print(i, total)
            print('Done.')
            """)

    def test_break(self):
        self.assertCodeExecution(
            code="""
                i = 0
                while i < 10:
                    i = i + 1
                    print(i, i % 5)
                    if i % 5 == 0:
                        break
                    print("after")
                print("Done")
            """)

    def test_continue(self):
        self.assertCodeExecution(
            code="""
                i = 0
                while i < 10:
                    i = i + 1
                    print(i, i % 5)
                    if i % 5 == 0:
                        continue
                    print("after")
                print("Done")
            """)

    def test_nested(self):
        self.assertCodeExecution(
            code="""
                i = 1
                j = 10
                while i < j:
                    k = 0
                    while k < i:
                        print(i, j)
                        k = k + 1
                    print("While done")
                    i = i + 1
                print("Done")
            """)

    def test_while_forever(self):
        self.assertCodeExecution(
            code="""
                i = 0
                while 1:
                    print("Loop", i)
                    i = i + 1
                    if i == 10:
                        break
                print("Done")
            """)

    @expectedFailure
    def test_while_forever_with_if_not(self):
        self.assertCodeExecution(
            code="""
                i = 0
                while 1:
                    print("Loop", i)
                    i = i + 1
                    if not i < 10:
                        break
                print("Done")
            """)

    @expectedFailure
    def test_while_not_forever(self):
        self.assertCodeExecution(
            code="""
                while not 0:
                    print("Loop")
                    break
                print("Done")
            """)

    @expectedFailure
    def test_while_else(self):
        self.assertCodeExecution(
            code="""
                i = 1
                j = 4
                while i < j:
                    print(i)
                    i = i + 1
                else:
                    print("Else")
                print("Done")
            """)

    @expectedFailure
    def test_while_else_break(self):
        self.assertCodeExecution(
            code="""
                i = 1
                j = 4
                while i < j:
                    print(i)
                    i = i + 1
                    break
                else:
                    print("Else")
                print("Done")
            """)

    @expectedFailure
    def test_while_forever_inside_try(self):
        """Test ``while True`` inside try/finally block.

        Currently raises::

            Traceback (most recent call last):
              ...
              File ".../env/src/voc/voc/python/opcodes.py", line 962, in convert
                self.convert_opcode(context, arguments)
              File ".../env/src/voc/voc/python/opcodes.py", line 1394, in convert_opcode
                jump(JavaOpcodes.GOTO(0), context, current_loop, Opcode.NEXT)
            UnboundLocalError: local variable 'current_loop' referenced before assignment
        """
        self.assertCodeExecution(
            code="""
                i = 0
                try:
                    while 1:
                        print("Loop", i)
                        i = i + 1
                        if i == 10:
                            break
                finally:
                    print("Done")
            """)
