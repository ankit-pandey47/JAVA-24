
//gather() is a preview feature in Java 24
//Gatherers.windowFixed(2) groups elements into fixed-sized windows (sublists of size 2).

// .gather() is a new Java 24 Stream API feature.
// it allows custom procesing of element
// Gatherer.of(...) defines a custom gathering operation.
// Parameters in lambda function:
//state → not used here, but can store intermediate results.
//element → The current element being processed in the stream.
//downstream → Used to push elements into the output.

//Unique Features of .gather()
// .gather() allows early termination based on a condition.
//Instead of just returning a single value like .map(), .gather() can push multiple values for each input.

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Gatherer;
import java.util.stream.Gatherers;
import java.util.stream.Stream;
import java.util.stream.Gatherer.Downstream;
import java.util.stream.Gatherer.Integrator;

void main() {
    List<Integer> list = List.of(1, 2, 3, 4, 5);

    List<List<Integer>> result = list.stream().gather(Gatherers.windowFixed(2))
            .collect(Collectors.toList());

    System.out.println(result); // [[1, 2], [3, 4], [5]] // groups elemnts into sublist of 2

    // example 2

    var source = List.of(1, 2, 3);
    var result1 = source.stream()
            .gather(
                    Gatherer.of(
                            (state, element, downstream) -> {
                                downstream.push(element);
                                if (element == 2)
                                    return false; // stop further processing(early termination)

                                return true; // continue further processing
                            }))
            .toList();

    System.out.println(result1); // [1, 2] bcoz we are doing early termination when element comes to be 2.

    // unlike map() and other which return single value for one i/p , it return
    // multiple as per need.

    var result2 = source.stream().gather(Gatherer.of((state, element, downstream) -> {
        if (element == 1) {
            downstream.push("ANKIT");
            downstream.push("am");
        }
        downstream.push(element);
        return true;
    })).toList();

    System.out.println(result2); // [ANKIT, am, 1, 2, 3] // we are returning multiple value when elemnt is 1
}
