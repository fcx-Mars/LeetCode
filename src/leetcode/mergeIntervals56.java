package leetcode;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import util.Interval;

public class mergeIntervals56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * 效率非常低，转化为数组处理比较快
	 */
	public List<Interval> merge(List<Interval> intervals) {
        
		Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				if (o1.start > o2.start) {
					return 1;
				}else if(o1.start < o2.start) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		//intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		int i = 0;
		while(i < intervals.size()-1) {
			if (intervals.get(i).end >= intervals.get(i+1).start && intervals.get(i).end < intervals.get(i+1).end) {
				intervals.get(i).end = intervals.get(i+1).end;
				intervals.remove(i+1);
			}else if(intervals.get(i).end < intervals.get(i+1).start){
				i++;
			}else {
				intervals.remove(i+1);
			}
		}
		
		return intervals;
    }
}

/*leetcode中相对不错的解
 * public List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() <= 1)
        return intervals;
    
    // Sort by ascending starting point using an anonymous Comparator
    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
    
    List<Interval> result = new LinkedList<Interval>();
    int start = intervals.get(0).start;
    int end = intervals.get(0).end;
    
    for (Interval interval : intervals) {
        if (interval.start <= end) // Overlapping intervals, move the end if needed
            end = Math.max(end, interval.end);
        else {                     // Disjoint intervals, add the previous one and reset bounds
            result.add(new Interval(start, end));
            start = interval.start;
            end = interval.end;
        }
    }
    
    // Add the last interval
    result.add(new Interval(start, end));
    return result;
}
 */



