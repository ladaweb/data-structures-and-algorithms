import java.util.*;

public class CoveringSegments {


    public static List<Integer> optimalPoints(Segment[] segments) {
        Arrays.sort(segments, Comparator.comparingInt(o -> o.end));

        int p = -1;

        List<Integer> points = new ArrayList<>();
        for (Segment segment : segments) {
            if (!segment.isInSegment(p)) {
                p = segment.end;
                points.add(p);
            }
        }

        return points;
    }

    public static class Segment {
        int start, end;
        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        boolean isInSegment(int point) {
            return point >= start && point <= end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        List<Integer> points = optimalPoints(segments);
        System.out.println(points.size());
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
