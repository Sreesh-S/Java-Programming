interface Sports{
    int getSportsScore();
}

class Student{
    private int  academicScore;

    public void setAcademicScore(int score) 
    {
        academicScore=score;
    }       
    public int  getAcademicScore()
    {
        return academicScore;
    }
 }

    class Result extends Student implements Sports{
        private int sportsScore;
        public void setSportsScore(int score)
        {
            sportsScore=score;
        }

        public int getSportsScore(){
            return sportsScore;

        }

        public void displayScores(){
            System.out.println("Academic score:"+getAcademicScore());
            System.out.println("Sports score:"+getSportsScore());
        }
    }

    public class M{
        public static void main(String[] args) {
            Result studentResult=new Result();
            studentResult.setAcademicScore(91);
            studentResult.setSportsScore(86);
            studentResult.displayScores();

        }
    }


