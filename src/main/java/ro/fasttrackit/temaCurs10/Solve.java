package ro.fasttrackit.temaCurs10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solve {
    public static void main(String[] args) {
        String path = "C:\\Work\\textExcel.xlsx";
        try {
            Workbook workbook = WorkbookFactory.create(new File(path));
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> it = firstSheet.rowIterator();
            List<CustomerPurchase> customerPurchaseList = new ArrayList<>();
            while (it.hasNext()) {
                CustomerPurchase customerPurchase = new CustomerPurchase();
                Row currentRow = it.next();
                for (Cell currentCell : currentRow) {
                    CellAddress address = currentCell.getAddress();

                    if (0 == address.getColumn()) {
                        customerPurchase.setID((int) currentCell.getNumericCellValue());
                    } else if (1 == address.getColumn()) {
                        customerPurchase.setPurchasedProduct(currentCell.getStringCellValue());
                    } else if (2 == address.getColumn()) {
                        customerPurchase.setName(currentCell.getStringCellValue());
                    } else if (8 == address.getColumn()) {
                        customerPurchase.setCategory(currentCell.getStringCellValue());
                    }

                }
                customerPurchaseList.add(customerPurchase);
            }
            System.out.println(customerPurchaseList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
