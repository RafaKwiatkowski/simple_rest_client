package rk.training.simple_rest_client.dto;

/**
 * @author: Rafał Kwiatkowski
 * @created: 05.08.2018 14:11
 */

public class Contract {

    private int id;
    private String name;

    public Contract() {
    }

    public Contract(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
