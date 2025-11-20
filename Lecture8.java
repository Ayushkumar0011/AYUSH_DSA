import java.util.Scanner;

public class Lecture8 {
    public static void main(String[] args) {
    //     int elements[]={1,2,3,4,5,6};
    // for(int r:elements)
    // {
    //     System.out.println(r);
    // }
    int div=0;
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    while(n >0)
    {
        int res=n/2;
        div++;
        if(res%2 !=0)
        {
            continue;
        }
        if(div>5)
        { break;}
    }
    if(div > 5)
    {
        System.out.println("divide more than 5 -> "+ div  );
    }
    else{
        
    }
}
}
