package com.mec.exercise.one;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by javierbracerotorres on 16/10/2016.
 */
public final class Matrix {
    private final List<Character> characters;
    private final int numColumns;
    private final Character givenType;
    private final static int NOT_FOUND = 0;

    public Matrix(final List<Character> characters, final Character givenType, final int numColumns) {
        this.characters = characters;
        this.numColumns = numColumns;
        this.givenType = givenType;
    }

    public int execute() {
        List<Integer> matches = filterByGivenType();

        if (numColumns == 0 || matches.size() == 0) {
            return NOT_FOUND;
        }

        BlockGrouper blockGrouper = new BlockGrouper(matches, numColumns);
        blockGrouper.runGrouping(0);

        return getLargestConnected(blockGrouper);
    }

    /**
     * Filter the characters list by the given type.
     *
     * @return a List filter by given type.
     */
    private List<Integer> filterByGivenType() {
        return Stream.iterate(0, n -> n + 1)
                .limit(characters.size())
                .filter(i -> characters.get(i).equals(givenType))
                .collect(toList());
    }

    /**
     * Gets the total number of blocks for the largest connected block.
     *
     * @param blockGrouper
     * @return
     */
    private int getLargestConnected (BlockGrouper blockGrouper) {
        Optional<Integer> max = blockGrouper.getConnectedGroups().stream()
                .map(g -> g.size())
                .reduce(Integer::max);

        if (max.isPresent()) {
            return max.get();

        } else {
            return NOT_FOUND;
        }
    }
}
