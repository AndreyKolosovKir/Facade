public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println("sumBin - " + bins.sum("0101", "0111"));
        System.out.println("multBin - " + bins.mult("0101", "0111"));
    }
}