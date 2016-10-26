package com.mec.exercise.one;

import java.util.*;

import static java.util.stream.Collectors.toSet;

/**
 * Created by javierbracerotorres on 16/10/2016.
 */
final class BlockGrouper {

    private final List<Integer> matches;
    private List<Set<Integer>> connectedGroups;
    private final int numColumns;

    BlockGrouper(List<Integer> matches, int numColumns) {
        this.matches = matches;
        this.connectedGroups = new LinkedList<>();
        this.numColumns = numColumns;
    }

    void runGrouping(int currentPos) {
        boolean newGroup = true;

        if (!connectedGroups.isEmpty()) {
            boolean isConnectedH = false;
            boolean isConnectedV = false;

            for (Set<Integer> connectedGroup : connectedGroups) {

                if (tryToConnect(connectedGroup, matches.get(currentPos), numColumns)) {
                    newGroup = false;
                    isConnectedV = true;
                }

                if (tryToConnect(connectedGroup, matches.get(currentPos), 1)) {
                    newGroup = false;
                    isConnectedH = true;
                }
            }

            if (isConnectedH && isConnectedV) {
                joinGroups(currentPos);
            }
        }

        if (newGroup) {
            Set<Integer> group = new HashSet<>();
            group.add(matches.get(currentPos));
            connectedGroups.add(group);
        }

        if (matches.size() <= currentPos + 1) {
            return;
        } else {
            runGrouping(currentPos + 1);
        }
    }

    List<Set<Integer>> getConnectedGroups() {
        return connectedGroups;
    }

    /**
     * Tries to connect the currentMatch to a neighbouring block
     *
     * @param connectedGroup the current neighbouring block group
     * @param currentMatch the current match
     * @param previousPos previous position on the connectedGroup
     * @return
     */
    private boolean tryToConnect(Set<Integer> connectedGroup, int currentMatch, int previousPos) {
        if (connectedGroup.contains(currentMatch - previousPos)) {
            connectedGroup.add(currentMatch);
            return true;
        }

        return false;
    }

    /**
     * Join two groups sharing the same matches and add it to the connected groups.
     *
     * @param currentPos the position of the match
     */
    private void joinGroups(int currentPos) {
        Set<Integer> bothGroups = connectedGroups.stream()
                .filter(g -> g.contains(matches.get(currentPos)))
                .map(g -> g.toArray(new Integer[0]))
                .flatMap(Arrays::stream)
                .collect(toSet());

        connectedGroups.add(bothGroups);
    }
}
