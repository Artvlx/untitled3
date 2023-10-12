

public class test {
    public static void main(String[] args) {
float gravityChangeProkopenko = 38; //in percents
float earthWeightArtur = 70;
double marsWeigthArtur;
marsWeigthArtur = earthWeightArtur*(gravityChangeProkopenko/100);
String result = String.format("%.4f",marsWeigthArtur);
System.out.println("I counted my weight on mars by multiplying my weight on earth by the percent of gravitation on mars and limited its length to 4 decimal places. It equals " + result);
int castMarsWeightArtur = (int) marsWeigthArtur;
System.out.println("I casted my weight on mars which was double type to integer type " + castMarsWeightArtur);
char castToCharMarsWeight = (char) castMarsWeightArtur;
System.out.println("I casted my weight on mars which was integer type to char type " + castToCharMarsWeight);
int marsWeightMultiplyingArtur = (int)castToCharMarsWeight*11;
System.out.println("I multiplied it by 11 and now it equals " + marsWeightMultiplyingArtur);
    }
}