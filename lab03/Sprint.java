import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int capacity;
    private int ticketLimit;
    private List<Ticket> tickets;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory != null && !userStory.isCompleted() && !tickets.contains(userStory)) {
            int newCapacity = getTotalEstimate() + userStory.getEstimate();
            if (newCapacity <= capacity && tickets.size() < ticketLimit) {
                tickets.add(userStory);
                return true;
            }
        }
        return false;
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport != null && !bugReport.isCompleted() && !tickets.contains(bugReport)) {
            int newCapacity = getTotalEstimate() + bugReport.getEstimate();
            if (newCapacity <= capacity && tickets.size() < ticketLimit) {
                tickets.add(bugReport);
                return true;
            }
        }
        return false;
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate() {
        int totalEstimate = 0;
        for (Ticket ticket : tickets) {
            totalEstimate += ticket.getEstimate();
        }
        return totalEstimate;
    }
}