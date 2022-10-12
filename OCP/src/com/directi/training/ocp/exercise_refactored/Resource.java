package com.directi.training.ocp.exercise_refactored;

public abstract class ResourceAllocator
{

    public abstract void markSlotFree(int resourceId);
    public abstract void markSlotBusy(int resourceId);
    private abstract int findFreeSlot();



}