import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalcuProteinMass {
public static void main(String[] args)throws IOException{
	FileReader u=new FileReader("/home/hheting/Downloads/rosalind_prtm.txt");
	
	BufferedReader br= new BufferedReader(u);
	
	String str=br.readLine();
	
	double a=71.03711;
	double c=103.00919;
	double d=115.02694;
	double e=129.04259;
	double f=147.06841;
	double g=57.02146;
	double h=137.05891;
	double i=113.08406;
	double k=128.09496;
	double l=113.08406;
	double m=131.04049;
	double n=114.04293;
	double p=97.05276;
	double q=128.05858;
	double r=156.10111;
	double s=87.03203;
	double t=101.04768;
	double v=99.06841;
	double w=186.07931;
	double y=163.06333;
	double mass=0.0;
	
	String[] arr=str.split("(?<=\\G.{1})");
	
	for(int z=0;z<arr.length;z++){
		
		if(arr[z].contains("A")){
			
			mass=mass+a;
		}
		
		if(arr[z].contains("C")){
			
			mass=mass+c;
		}
		
		if(arr[z].contains("D")){
			
			mass=mass+d;
		}
		
		if(arr[z].contains("E")){
			
			mass=mass+e;
		}
		
		if(arr[z].contains("F")){
			
			mass=mass+f;
		}
		
		if(arr[z].contains("G")){
			
			mass=mass+g;
		}
		
		if(arr[z].contains("H")){
			
			mass=mass+h;
		}
		
		if(arr[z].contains("I")){
			
			mass=mass+i;
		}
		
		if(arr[z].contains("K")){
			
			mass=mass+k;
		}
		
		if(arr[z].contains("L")){
			
			mass=mass+l;
		}
		
		if(arr[z].contains("M")){
			
			mass=mass+m;
		}
		
		if(arr[z].contains("N")){
			
			mass=mass+n;
		}
		
		if(arr[z].contains("P")){
			
			mass=mass+p;
		}
		
		if(arr[z].contains("Q")){
			
			mass=mass+q;
		}
		
		if(arr[z].contains("R")){
			
			mass=mass+r;
		}
		
		if(arr[z].contains("S")){
			
			mass=mass+s;
		}
		
		if(arr[z].contains("T")){
			
			mass=mass+t;
		}
		
		if(arr[z].contains("V")){
			
			mass=mass+v;
		}
		
		if(arr[z].contains("W")){
			
			mass=mass+w;
		}
		
		if(arr[z].contains("Y")){
			
			mass=mass+y;
		}
	}
	
	System.out.print(mass);
	
}
}
