public class Runner {
    public static void main(String[] args) {
        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));
        System.out.println(nextMethod(true));
    }

    private static boolean nextMethod(boolean b) {
        return true;
    }

    public static String helloName(String name) {
        return "hi " + name;
    }



public boolean icyHot(int temp1, int temp2) {
    if(temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0){
        return true;
    }else{
        return false;
    }
}

public String makeAbba(String a, String b) {
    return a + b + b + a;
}

public boolean lessBy10(int a, int b, int c) {
    if(Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10){
        return true;
    }else{
        return false;
    }
}

public int countHi(String str) {
    if(str.length() < 2){
        return 0;
    }
    int count = 0;
    for(int i=0; i < str.length()-1; i++){
        if(str.substring(i, i+2).equals("hi")){
            count++;
        }
    }
    return count;
}

public boolean tripleUp(int[] nums) {
    for(int i=1; i < nums.length-1; i++){
        if(nums[i] - 1 == nums[i-1] && nums[i+1] - 1 == nums[i]){
            return true;
        }
    }
    return false;
}

public boolean array123(int[] nums) {
    for(int i=1; i < nums.length-1; i++){
        if(nums[i] - 1 == 1 && nums[i+1] - 2 == 1){
            return true;
        }
    }
    return false;
}


public int[] plusTwo(int[] a, int[] b) {
    int [] plusTwo = {a[0], a[1], b[0], b[1]};
    return plusTwo;
}

public int luckySum(int a, int b, int c) {
    if(a==13){
        a=0; b=0; c=0;
    }
    if(b==13){
        b=0; c=0;
    }
    if(c==13){
        c=0;
    }
    int luckySum = a + b + c;
    return luckySum;
}


