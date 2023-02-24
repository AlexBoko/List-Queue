package transport;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public Queue<Transport> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Transport> queue) {
        this.queue = queue;
    }

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addACarToTheQueue(Transport transport) {
        if (transport.checksTheAdditionToTheQueue()) {
            queue.add(transport);
        }
    }
    public void carryOutATechnicalInspectionOfTheCar () {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
        }
    }
    public void carryOutAVehicleInspection(Queue<Transport> queue) {
        if (queue.isEmpty()) {
            System.out.println("У данного ТС нет механников");
        }else {
            Transport transport = queue.poll();
            List<Mechanic> mechanics = transport.getMechanics();
            for (Mechanic mechanic : mechanics) {
                mechanic.performMaintenance(transport);
            }
        }
    }
}