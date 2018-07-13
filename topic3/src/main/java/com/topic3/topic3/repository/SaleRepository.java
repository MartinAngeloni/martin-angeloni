package com.topic3.topic3.repository;

import com.topic3.topic3.entity.Sale;
import java.util.ArrayList;
import java.util.List;

/**
 * A singleton class to simulate a database
 * CRUD Services implementation of Cart
 * Created by martin on 9/7/2018.
 * @author angelonimartin90@gmail.com
 */
public class SaleRepository implements Repository<Sale> {

    private final List<Sale> sales = new ArrayList<Sale>();

    private static SaleRepository saleRepository;

    private SaleRepository(){}

    /**
     * Get the instance of himself
     * @return instance of this class
     */
    public static SaleRepository getSales(){
        if(saleRepository == null){
            saleRepository = new SaleRepository();
        }
        return saleRepository;
    }

    /**
     * Add a new Sale to list
     * @param sale - Sale Object
     * @return - Sale object created
     */
    @Override
    public Sale create(Sale sale) {
        sales.add(sale);
        return sale;
    }

    /**
     * Get a Sale from his id
     * @param id - id of the Sale to search
     * @return - Sale Object
     */
    @Override
    public Sale get(int id) {
        for (Sale s: sales) {
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    /**
     * Replace the old Sale to another Sale
     * @param sale - Sale Object
     */
    @Override
    public void update(Sale sale) {
        Sale saleToUpdate = null;
        for (Sale s: sales) {
            if(s.getId() == sale.getId()){
                saleToUpdate = s;
                break;
            }
        }
        sales.remove(saleToUpdate);
        sales.add(sale);
    }

    /**
     * Delete Sale from the list
     * @param sale - Sale Object to delete
     */
    @Override
    public void delete(Sale sale) {
        Sale saleToDelete = null;
        for (Sale s: sales) {
            if(s.getId() == sale.getId()){
                saleToDelete = s;
                break;
            }
        }
        sales.remove(saleToDelete);
    }

    /**
     * Get the all Sales
     * @return - the list of all Sales
     */
    @Override
    public List<Sale> getAll() {
        return sales;
    }
}
