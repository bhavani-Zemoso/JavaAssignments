package lambdas_and_streams;

public class CapturingLambda {
    Trade trade = new Trade("IBM", 20000, "OPEN");

    public interface ITrade
    {
        public boolean check(Trade t);
    }

    public boolean isOpenTrade()
    {
        ITrade simpleLambda = (t) -> t.isOpen()?true:false;
        return simpleLambda.check(trade);
    }

    public boolean checkStatus(String status)
    {
        ITrade statusLambda = (t) -> t.getStatus().equals(status)?true:false;
        return statusLambda.check(trade);
    }

    public boolean isOpenAndBig(String status, int quantity)
    {
        ITrade openAndLargeTradeLambda = (t) -> {
            return (t.getStatus().equals(status) && t.getQuantity() > quantity)?true:false;
        };

        return openAndLargeTradeLambda.check(trade);
    }

    int count = 10;
    public void instanceVariable(int localCount)
    {
        for(int i = 10; i > count; i--){
            ITrade statusLambda = t ->{
                count++;
//					localCount++;
                return t.isOpen();
            };
        }

    }
}
