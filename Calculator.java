
/**
 * 렌탈 DVD 할인요금계산 소프트웨어 프로그램
 * 
 * @author (2017315002 김아름, 2017315038 이수정, 2018315051  야마모토 요시카) 
 * @version (2020.06.10)
 */
public class Calculator
{
    public int Calculator(int age, boolean past){
        double rate = 10000;
        
        if(past == false){
            if (age <= 18){
                rate = rate * 0.9;
            }
            else if (age >= 65){
                rate = rate * 0.8;
            }
        }
        else if(past == true){
            rate = rate * 0.5;
        }
        return (int)rate;
    }
}
