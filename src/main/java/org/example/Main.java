package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean plaindrom = isPalindrome(-1221);
        System.out.println("Plaindrom: "+plaindrom);
        System.out.println("--------------------");
        boolean perfectNumber = isPerfectNumber(6);
        System.out.println("Perfect Number: "+ perfectNumber);
        String numberToWord =  numberToWords(123);
        System.out.println("Numbers to Word: "+ numberToWord);
    }
    public static boolean isPalindrome(int num){
        num = Math.abs(num);
        String sayi = String.valueOf(num);
        System.out.println(sayi);
        String[] sayilar = sayi.split("");
        //System.out.println(sayilar[0] + sayilar[1]);
        String[] tersSayilar = new String[sayilar.length];
        for(int i= sayilar.length; i>0; i--){
            tersSayilar[sayilar.length - i] = sayilar[i-1];
        }
        String tersSayi = String.join("", tersSayilar);
        System.out.println(tersSayi);
        if(sayi.equals(tersSayi)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPerfectNumber(int num){
        if(num<0){
            return false;
        }
        int toplam = 1;
        for(int i = 2; i<=num/2; i++){
            if(num%i == 0){
                toplam += i;
            }
        }
        System.out.println(toplam);
        if(toplam == num){
            return true;
        }else {
            return false;
        }
    }

    public static String numberToWords(int num){
        if(num<0){
            return "Invalid Value";
        }
        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};
        String[] nums = String.valueOf(num).split("");
        String[] kelimeler = new String[nums.length];
        for(int i=0; i< nums.length; i++){
            kelimeler[i] = words[Integer.parseInt(nums[i])];
        }
        String kelime = String.join(" ", kelimeler);
        return kelime;
    }
}
