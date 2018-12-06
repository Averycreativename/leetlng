//this program replace letters with numbers
import java.io.*;
import java.util.Scanner;


class leeter
{
public static void main(String[] args) throws IOException
{
	if(args.length==0)
	{
	Scanner s = new Scanner(System.in);
	String str=s.next();
	for(int i=0;i<str.length();i++)
	{
	checkletter(str.charAt(i));
	//System.out.print(str.length());	
	}
	System.exit(0);
	}
	else if(args.length>1)
	{
	System.out.println("The number of arguments should be 1 or 2");
	System.exit(-1);
	}	
File file0 = new File(args[0]);
BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(file0), "UTF-8"));
int currentch;
	while((currentch=fr.read())!=-1)
	{
	
		checkletter((char)currentch);
	}
}
static void checkletter(char ch)
{
switch(ch)
		{
            		case 'a':{ System.out.print("4"); break;}
			case 'A':{ System.out.print("4"); break;}
            		case 'b':{ System.out.print("8"); break;}
            		case 'B':{ System.out.print("8"); break;}
            		case 'c':{ System.out.print("<"); break;}
			case 'C':{ System.out.print("<"); break;}
            		case 'd':{ System.out.print("|)"); break;}
            		case 'D':{ System.out.print("|)"); break;}
			case 'e':{ System.out.print("3"); break;}
			case 'E':{ System.out.print("3"); break;}
            		case 'f':{ System.out.print("|="); break;}
            		case 'F':{ System.out.print("|="); break;}
            		case 'g':{ System.out.print("6"); break;}
            		case 'G':{ System.out.print("6"); break;}
            		case 'h':{ System.out.print("|-|"); break;}
            		case 'H':{ System.out.print("|-|"); break;}
            		case 'i':{ System.out.print("1"); break;}
            		case 'I':{ System.out.print("1"); break;}
            		case 'j':{ System.out.print("_|"); break;}
            		case 'J':{ System.out.print("_|"); break;}
            		case 'k':{ System.out.print("|<"); break;}
            		case 'K':{ System.out.print("|<"); break;}
            		case 'l':{ System.out.print("|_"); break;}
            		case 'L':{ System.out.print("|_"); break;}
            		case 'm':{ System.out.print("|V|"); break;}
            		case 'M':{ System.out.print("|V|"); break;}
            		case 'n':{ System.out.print("/V"); break;}
            		case 'N':{ System.out.print("/V"); break;}
            		case 'o':{ System.out.print("0"); break;}
            		case 'O':{ System.out.print("0"); break;}
            		case 'p':{ System.out.print("|o"); break;}
            		case 'P':{ System.out.print("|o"); break;}
            		case 'q':{ System.out.print("9"); break;}
            		case 'Q':{ System.out.print("9"); break;}
            		case 'r':{ System.out.print("|2"); break;}
            		case 'R':{ System.out.print("|2"); break;}
            		case 's':{ System.out.print("5"); break;}
            		case 'S':{ System.out.print("5"); break;}
            		case 't':{ System.out.print("7"); break;}
            		case 'T':{ System.out.print("7"); break;}
            		case 'u':{ System.out.print("|_|"); break;}
            		case 'U':{ System.out.print("|_|"); break;}
            		case 'v':{ System.out.print("ˇ"); break;}
            		case 'V':{ System.out.print("ˇ"); break;}
            		case 'w':{ System.out.print("VV"); break;}
            		case 'W':{ System.out.print("VV"); break;}
            		case 'x':{ System.out.print("%"); break;}
            		case 'X':{ System.out.print("%"); break;}
            		case 'y':{ System.out.print("¥"); break;}
            		case 'Y':{ System.out.print("¥"); break;}
            		case 'z':{ System.out.print("2"); break;}
            		case 'Z':{ System.out.print("2"); break;}
			default:{System.out.print(ch); break;}
		}
}
}
