package exercise_refactored;

public class TimeAllocator extends Resource
{

    private final double _resourceId;

    public TimeAllocator(double resourceId)
    {
        _resourceId = resourceId;
    }

    @Override
    public void markSlotFree(int resourceId)
    {

    }

    @Override
    private void markSlotBusy(int resourceId)
    {

    }

    @Override
    private int findFreeSlot()
    {
        return 0;
    }



}
