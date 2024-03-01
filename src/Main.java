import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
        int[] list = {3,7,4,4,2,9,10,21,2,3,3,10,1,1};

        int sayac=0;
        int geciciSayac=0;
        int repeatNumber =0;
        Arrays.sort(list);
        for(int i=0; i<list.length ;i++ ){
            sayac=0;
         for(int j=0 ;j<list.length ; j++){
                if((list[i] == list[j])){
                        sayac ++;
                    }

              }
         /* dizideki elemanlar küçükten
            büyüğe sıralandığından kendinden
            bir önceki eleman ya aynıdır ya
            farklıdır eğer aynı ise bu elemanı tekrar sayma.*/
            if(i!=0 && list[i-1]!=list[i] && sayac>1)
            {
                System.out.println(String.format("%d 'den %d tane var.", list[i], sayac));
            }

        }
        }

    }

