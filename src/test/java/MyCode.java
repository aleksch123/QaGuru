import java.util.*;

class MyCode {


    public static void main(String[] args) {

       solve(new int[]{3,4,4,3,6,3});



    }


    public static int[] solve(int [] arr){

        List<Integer> intList = new ArrayList<>();

        for (int num: arr ) {
            if(intList.contains(num)){
                intList.remove(intList.indexOf(num));
                intList.add(num);

            }else {intList.add(num);}

        }

        return intList.stream().mapToInt(i -> i).toArray();
    }



    }



