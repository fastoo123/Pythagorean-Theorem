/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytha;

/**
 *
 * @author legok
 */
public class Methods {
    double s1;
    double s2;
    double s3;
    
public void setSideA(double a)
{
    s1 = a;
}

public double getSideA()
{
    return s1;
}

public void setSideB(double b)
{
    s2 = b;
}

public double getSideB()
{
    return s2;
}

public void pyth(double ant, double bant)
{
    s3 = Math.sqrt((Math.pow(ant, 2))+(Math.pow(bant,2)));
    System.out.println(s3);
}
}
