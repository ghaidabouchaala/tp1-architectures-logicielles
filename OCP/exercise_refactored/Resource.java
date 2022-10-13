package exercise_refactored;

public abstract class Resource
{

    public abstract void markSlotFree(int resourceId);
    public abstract void markSlotBusy(int resourceId);
    public abstract int findFreeSlot();

}

