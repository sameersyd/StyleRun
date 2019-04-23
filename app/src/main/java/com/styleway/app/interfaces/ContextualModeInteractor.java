package com.styleway.app.interfaces;

/**
 * Created by a_man on 02-12-2017.
 */

public interface ContextualModeInteractor {
    void enableContextualMode();

    boolean isContextualMode();

    void updateSelectedCount(int count);
}
