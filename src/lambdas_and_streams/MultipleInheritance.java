package lambdas_and_streams;

interface Engine1{
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}

interface Vehicle1 extends Engine{
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}
class Car2 implements Engine1, Vehicle1{

    String getModel(int id)
    {
        return model(id);
    }

    @Override
    public String model(int id) {
        return Engine1.super.model(id);
    }
}


public class MultipleInheritance {

    public static void main(String[] args) {
    }

}

