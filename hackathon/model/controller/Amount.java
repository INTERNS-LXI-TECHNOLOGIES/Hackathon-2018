package model.controller;
import java.util.*;
public class Amount
{
private String sell;
Scanner scan = new Scanner(System.in);

public void setSell(String sell)
{
	sell = sell;
}
public String getSell()
{
	return sell;
}

public void sellOfInput()
{
	System.out.print("sell amount:")
	setSell(scan.next());
}

}