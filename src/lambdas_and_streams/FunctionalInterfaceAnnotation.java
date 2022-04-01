package lambdas_and_streams;

public class FunctionalInterfaceAnnotation {

    @FunctionalInterface
    interface Cruncher
    {
        int crunch(int i, int j);
    }

    public int cruncherService(int i, int j, Cruncher cruncher)
    {
        return(cruncher.crunch(i, j));
    }

    public static void main(String[] args) {

        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();

        //Client 1
        int ans = client.cruncherService(38,12, (p,q) -> p*q);
        System.out.println(ans);

        //Client 2
        ans = client.cruncherService(12,1, (p,q) -> p-q);
        System.out.println(ans);

        //Client 3
        ans = client.cruncherService(38,12, (p,q) -> p+q);
        System.out.println(ans);

        //Client 4
        ans = client.cruncherService(36,12, (p,q) -> p/q);
        System.out.println(ans);

    }
}
