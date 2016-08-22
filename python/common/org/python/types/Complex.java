package org.python.types;

public class Complex extends org.python.types.Object {
    public double real;
    public double imaginary;

    /**
     * A utility method to update the internal value of this object.
     *
     * Used by __i*__ operations to do an in-place operation.
     * obj must be of type org.python.types.Complex
     */
    void setValue(org.python.Object obj) {
        this.real = ((org.python.types.Bool) obj).real;
        this.imaginary = ((org.python.types.Bool) obj).imaginary;
    }

    public java.lang.Object toJava() {
        // return this.value;
    }

    public org.python.Object byValue() {
        // return new org.python.types.Bool(this.value);
    }

    public int hashCode() {
        // return new java.lang.Boolean(this.value).hashCode();
    }

    public Complex(double real_val) {
        super();
        this.real = real_val;
    }

    public Complex(double real_val, double imagi_val) {
        super();
        this.real = real_val;
        this.imaginary = imagi_val;
    }

    public Complex(long real_val) {
        super();
        this.real = real_val;
    }

    public Complex(long real_val, long imagi_val) {
        super();
        this.real = real_val;
        this.imaginary = imagi_val;
    }

    // public org.python.Object __new__() {
    //     throw new org.python.exceptions.NotImplementedError("bool.__new__() has not been implemented.");
    // }

    // public org.python.Object __init__() {
    //     throw new org.python.exceptions.NotImplementedError("bool.__init__() has not been implemented.");
    // }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Str __repr__() {
        throw new org.python.exceptions.NotImplementedError("complex.__repr__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Str __format__(org.python.Object format_string) {
        throw new org.python.exceptions.NotImplementedError("complex.__format__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __lt__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__lt__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __le__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__le__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __eq__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__eq__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __ne__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__ne__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __gt__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__gt__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __ge__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__ge__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Bool __bool__() {
        return new org.python.types.Bool(this.value);
    }

    public boolean __setattr_null(java.lang.String name, org.python.Object value) {
        // Builtin types can't have attributes set on them.
        return false;
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.List __dir__() {
        throw new org.python.exceptions.NotImplementedError("complex.__dir__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )

    public org.python.Object __add__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__add__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __sub__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__sub__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __mul__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__mul__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __truediv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__truediv__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __floordiv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__floordiv__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __mod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__mod__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __divmod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__divmod__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __pow__(org.python.Object other, org.python.Object modulo) {
        throw new org.python.exceptions.NotImplementedError("complex.__pow__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __lshift__(org.python.Object other) {
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Int((((org.python.types.Bool) this).value ? 1 : 0) << (((org.python.types.Bool) other).value ? 1 : 0));
        } else if (other instanceof org.python.types.Int) {
            long other_val = ((org.python.types.Int) other).value;
            if (other_val < 0) {
                throw new org.python.exceptions.ValueError("negative shift count");
            }
            return new org.python.types.Int((((org.python.types.Bool) this).value ? 1 : 0) << other_val);
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for <<: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rshift__(org.python.Object other) {
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Int((((org.python.types.Bool) this).value ? 1 : 0) >> (((org.python.types.Bool) other).value ? 1 : 0));
        } else if (other instanceof org.python.types.Int) {
            long other_val = ((org.python.types.Int) other).value;
            if (other_val < 0) {
                throw new org.python.exceptions.ValueError("negative shift count");
            }
            return new org.python.types.Int((((org.python.types.Bool) this).value ? 1 : 0) >> other_val);
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for >>: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __and__(org.python.Object other) {
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Bool( (((org.python.types.Bool) this).value ? 1 : 0) & (((org.python.types.Bool) other).value ? 1 : 0));
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for &: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __xor__(org.python.Object other) {
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Bool( (((org.python.types.Bool) this).value ? 1 : 0) ^ (((org.python.types.Bool) other).value ? 1 : 0));
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for ^: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __or__(org.python.Object other) {
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Bool( (((org.python.types.Bool) this).value ? 1 : 0) | (((org.python.types.Bool) other).value ? 1 : 0));
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for |: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __radd__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__radd__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rsub__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rsub__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rmul__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rmul__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rtruediv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rtruediv__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rfloordiv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rfloordiv__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rmod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rmod__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rdivmod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rdivmod__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rpow__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rpow__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rlshift__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rlshift__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rrshift__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rrshift__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rand__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rand__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rxor__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__rxor__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __ror__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("bool.__ror__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )

    public org.python.Object __iadd__(org.python.Object other) {
        int this_val = (((org.python.types.Bool) this).value ? 1 : 0);
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Int( this_val += (((org.python.types.Bool) other).value ? 1 : 0) );
        } else if (other instanceof org.python.types.Int) {
            return new org.python.types.Int( this_val += ((org.python.types.Int) other).value);
        } else if (other instanceof org.python.types.Float) {
            return new org.python.types.Float(this_val += ((org.python.types.Float) other).value);
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for +=: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __ilshift__(org.python.Object other) {
        int this_val = (((org.python.types.Bool) this).value ? 1 : 0);
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Int(this_val <<= (((org.python.types.Bool) other).value ? 1 : 0));
        } else if (other instanceof org.python.types.Int) {
            long other_val = ((org.python.types.Int) other).value;
            if (other_val < 0) {
                throw new org.python.exceptions.ValueError("negative shift count");
            }
            return new org.python.types.Int(this_val <<= other_val);
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for <<=: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __irshift__(org.python.Object other) {
        int this_val = (((org.python.types.Bool) this).value ? 1 : 0);
        if (other instanceof org.python.types.Bool) {
            return new org.python.types.Int(this_val >>= (((org.python.types.Bool) other).value ? 1 : 0));
        } else if (other instanceof org.python.types.Int) {
            long other_val = ((org.python.types.Int) other).value;
            if (other_val < 0) {
                throw new org.python.exceptions.ValueError("negative shift count");
            }
            return new org.python.types.Int(this_val >>= other_val);
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for >>=: 'bool' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __neg__() {
        return new org.python.types.Int(this.value ? -1 : 0);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __pos__() {
        return new org.python.types.Int(this.value ? 1 : 0);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __abs__() {
        return new org.python.types.Int(this.value ? 1 : 0);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __invert__() {
        return new org.python.types.Int(this.value ? -2 : -1);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Int __int__() {
        return new org.python.types.Int(this.value ? 1 : 0);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Float __float__() {
        return new org.python.types.Float(this.value ? 1 : 0);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __round__(org.python.Object ndigits) {
        if (ndigits instanceof org.python.types.Int){
               return new org.python.types.Int(this.value? 1:0);
        }
         throw new org.python.exceptions.TypeError("'"+ndigits.typeName()+"' object cannot be interpreted as an integer");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __index__() {
        return new org.python.types.Int(this.value ? 1 : 0);
    }
}
