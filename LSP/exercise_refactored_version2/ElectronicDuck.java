/*
    Suggested version from Chaima
*/
package exercise_refactored_version2;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckIsOffException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new DuckIsOffException("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }

