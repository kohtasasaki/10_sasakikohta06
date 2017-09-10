public class Word{
  private String english;
  private String japanese;

  public Word(String english, String japanese){
    super();
    this.english = english;
    this.japanese = japanese;
  }
  public String getEnglish(){
    return english;
  }
  public String getJapanese(){
    return japanese;
  }
  public void setJapanese(String japanese){
    this.japanese = japanese;
  }

}