  
public class EstonianID implements PersonalCodeBehaviour {
    private String code;
  
    public EstonianID(String code){
      this.code = code;
    }
  
    @Override
    public String getGender() {
      // kirjutada loogika
      int gender = Integer.parseInt(code.substring(0,1));
      String answer = null;

/*       if(gender%2 == 0){
        answer = "Naine";
      } else{ 
        answer = "Mees";
      } */

      return gender % 2 == 0 ? "Female" : "Male"; // see on kergem variant
    }
  
    @Override
    public int getFullYear() {
      // TODO Auto-generated method stub
      int year = 1800 + ((Integer.parseInt(code.substring(0,1))+1)/2-1)*100+(Integer.parseInt(code.substring(1,3)));

      return year;


    }
  
    @Override
    public String getDOB() {
      // TODO Auto-generated method stub
      return null;
    }
    
  }