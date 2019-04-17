package restauranttest;

import ac.za.cput.domains.restaurant.Restaurant;
import ac.za.cput.factories.restaurantfactory.RestaurantFactory;
import org.junit.Assert;

public class TestRestaurant {


    public void restaurantTest()
    {
        String name = "Bennie";

        int totEmployees = 25;

        Restaurant restaurant= RestaurantFactory.getRestaurant(name,totEmployees);
        System.out.println(restaurant);
        Assert.assertNotNull(restaurant.getTotEmployees());

    }

}
