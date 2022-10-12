package com.directi.training.ocp.example_refactored;

import java.util.List;

public class ResourceAllocator
{
    public int allocate(Resource resource)
    {
        int resourceId;
        switch (resource) {
        case TIME_SLOT:
            resourceId = findFreeSlot();
            markSlotBusy(resourceId);
            break;
        case SPACE_SLOT:
            resourceId = findFreeSlot();
            markSlotBusy(resourceId);
            break;
        default:
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
            break;
        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
            switch (resource) {
            case TIME_SLOT:
                markSlotFree(resourceId);
                break;
            case SPACE_SLOT:
                markSlotFree(resourceId);
                break;
            default:
                System.out.println("ERROR: attempted to free invalid resource");
                break;
            }
    }
}
