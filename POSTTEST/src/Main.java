public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<MetodePembayaran> Method = new ArrayList<>();
        Method.add(new EWallet());
        Method.add(new KartuKredit());

        for (MetodePembayaran list : Method) {
            list.bayar(100000); 

            if (list instanceof EWallet) {
                EWallet OVO = (EWallet) list;
                OVO.bayar(50000);
            }

            else if (list instanceof KartuKredit){
                ((KartuKredit) list).bayar(50000);
            }

            else{
                list.bayar(10000);
            }
        }
    }
}
