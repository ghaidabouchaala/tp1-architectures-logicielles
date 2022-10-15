/*
    Suggested version from Chaima
*/
package exercise_refactored_version2;

public class Duck implements IDuck
{
    @Override
    public void quack()
    {
        System.out.println("Quack.....");
    }

    @Override
    public void swim()
    {
        System.out.println("Swim....");
    }

}