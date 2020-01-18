package MP21616範例程式碼.course.c12;

class Deeper {

    public Number getDepth(Number n) {
        return 10;
    }
}

class DeepA extends Deeper {

    @Override
    public Integer getDepth(Number n) {
        return 5;
    }
}

class DeepB extends Deeper {

    @Override
    public Double getDepth(Number n) {
        return 5d;
    }
}

class DeepC extends Deeper {

    @Override
    public String getDepth(Number n) {
        return "";
    }
}

class DeepD extends Deeper {

    public Long getDepth(int d) {
        return 5L;
    }
}

class DeepE extends Deeper {

    public Short getDepth(Integer n) {
        return 5;
    }
}

class DeepF extends Deeper {

    public Object getDepth(Object n) {
        return 5;
    }
}

public class TestOverride {
}
