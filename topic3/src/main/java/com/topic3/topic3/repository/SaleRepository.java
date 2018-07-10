package com.topic3.topic3.repository;

import com.topic3.topic3.entity.Sale;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 9/7/2018.
 */
public class SaleRepository implements IRepository<Sale> {

    private final List<Sale> sales = new ArrayList<Sale>();

    private static SaleRepository saleRepository;

    private SaleRepository(){}

    //return instance
    public static SaleRepository getSales(){
        if(saleRepository == null){
            saleRepository = new SaleRepository();
        }
        return saleRepository;
    }

    @Override
    public Sale create(Sale sale) {
        sales.add(sale);
        return sale;
    }

    @Override
    public Sale get(int index) {
        Sale sale = sales.get(index);
        return sale;
    }

    @Override
    public void update(Sale sale) {
        Sale saleToUpdate = null;
        for (Sale c: sales) {
            if(c.getId() == sale.getId()){
                saleToUpdate = c;
                break;
            }
        }
        sales.remove(saleToUpdate);
        sales.add(sale);
    }

    @Override
    public void delete(Sale sale) {
        Sale saleToDelete = null;
        for (Sale c: sales) {
            if(c.getId() == sale.getId()){
                saleToDelete = c;
                break;
            }
        }
        sales.remove(saleToDelete);
    }

    @Override
    public List<Sale> getAll() {
        return sales;
    }
}
