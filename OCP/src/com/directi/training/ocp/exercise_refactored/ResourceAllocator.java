package com.directi.training.ocp.example_refactored;

import java.util.List;

public class ResourceAllocator
{
    public int allocate(Resource resource)
    {
        int resourceId;
        if (resource)
        {
             resourceId = findFreeSlot();
             markSlotBusy(resourceId);
        } else {
              System.out.println("ERROR: Attempted to allocate invalid resource");
              resourceId = INVALID_RESOURCE_ID;

        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
         if (resource)
             markSlotFree(resourceId);
         else
             System.out.println("ERROR: attempted to free invalid resource");

    }
}
