package in.kgcoding.passby;

public class TestPassByReference {
    public static void main(String[] args) {
      Point first=new Point(4, 8);
      System.out.println("first"+ first);
      move(first);
      System.out.println("first"+ first);
    }
    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }


    public static class Point{
        int x;
        int y;

        public point(int x,int y){
            this.x=x;
            this.y=y;
        }

        public String toString(){
            finalStringBuilder sb=new StringBuilder("Point{");
            sb.appen("x=").appen(x);
            sb.append(",y=").append(y);
            sb.append('}');
            return sb.toString();
        }

        
    }
    
}
