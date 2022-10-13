package exercise_refactored;

public class SpaceAllocator extends Resource
{

    private final double _resourceId;

    public SpaceAllocator(double resourceId)
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
