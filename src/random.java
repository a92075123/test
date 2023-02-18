public class random {
    public static void main(String[] args) {

        int[] a = new int[6];

        boolean check;
        for (int i = 0; i < a.length; i++) {
            int rand = (int) (Math.random() * 6 + 1);
            check=false;
            for (int j = 0; j <=i; j++) {
                if(a[j]==rand){
                    check=true;
                    i--;
                    break;
                }
            }if(!check){
                a[i]=rand;
            }


        } for (int j = 0; j < a.length-1; j++) {
            for (int i = 0; i < a.length-1; i++) {
            int d;
            if(a[i]>a[i+1]) {
                d = a[i];
                a[i] = a[i + 1];
                a[i + 1] = d;
            }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}






