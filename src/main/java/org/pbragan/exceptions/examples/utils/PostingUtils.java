package org.pbragan.exceptions.examples.utils;


import org.pbragan.exceptions.exercises.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class PostingUtils {

    private static Collection<Posting> postingCollections;
    private static List<Publisher> publisherArg;
    private static List<Publisher> publisherBr;
    private static List<Publisher> publisherMx;
    private static List<Publisher> publisherPe;

    private static void loadPosting() {
        postingCollections = new ArrayList<>();
        postingCollections.add(new Posting(10410000, "Casa en alquiler", new Price(125527, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.86, StatusEnum.OFFLINE, new Date(2022,05,22)));
        postingCollections.add(new Posting(10410001, "Departamento en alquiler", new Price (116434, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.3, StatusEnum.ONLINE, new Date(2022,05,2)));
        postingCollections.add(new Posting(10410002, "Garaje en alquiler", new Price (193277, CurrencyEnum.PESOS), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.28, StatusEnum.DRAFT, new Date(2022,05,10)));
        postingCollections.add(new Posting(10410003, "local en alquiler", new Price (167868, CurrencyEnum.PESOS), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.64, StatusEnum.ONLINE, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410004, "Casa en venta", new Price (160648, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.12, StatusEnum.DRAFT, new Date(2022,05,17)));
        postingCollections.add(new Posting(10410005, "Departamento en venta", new Price (190011, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.63, StatusEnum.DRAFT, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410006, "Garaje en venta", new Price (144794, CurrencyEnum.PESOS), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.15, StatusEnum.OFFLINE, new Date(2022,05,29)));
        postingCollections.add(new Posting(10410008, "Departamento en alquiler temporal", new Price (144616, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.97, StatusEnum.ONLINE, new Date(2022,05,18)));
        postingCollections.add(new Posting(10410009, "Departamento en alquiler", new Price (166940, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.12, StatusEnum.DRAFT, new Date(2022,05,23)));
        postingCollections.add(new Posting(10410010, "Casa en venta", new Price (13197, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.17, StatusEnum.OFFLINE, new Date(2022,05,12)));
        postingCollections.add(new Posting(10410011, "Casa en alquiler", new Price (160622, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.68, StatusEnum.OFFLINE, new Date(2022,05,21)));
        postingCollections.add(new Posting(10410012, "Departamento en alquiler", new Price (17877, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.15, StatusEnum.ONLINE, new Date(2022,05,13)));
        postingCollections.add(new Posting(10410013, "Garaje en alquiler", new Price (147099, CurrencyEnum.DOLARES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.28, StatusEnum.DRAFT, new Date(2022,05,15)));
        postingCollections.add(new Posting(10410014, "local en alquiler", new Price (172566, CurrencyEnum.DOLARES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.01, StatusEnum.ONLINE, new Date(2022,05,20)));
        postingCollections.add(new Posting(10410015, "Casa en venta", new Price (104400, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.93, StatusEnum.DRAFT, new Date(2022,05,10)));
        postingCollections.add(new Posting(10410016, "Departamento en venta", new Price (181700, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.01, StatusEnum.DRAFT, new Date(2022,05,5)));
        postingCollections.add(new Posting(10410017, "Garaje en venta", new Price (197998, CurrencyEnum.SOLES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.7, StatusEnum.OFFLINE, new Date(2022,05,14)));
        postingCollections.add(new Posting(10410018, "Casa en alquiler temporal", new Price (82377, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.75, StatusEnum.DRAFT, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410019, "Departamento en alquiler temporal", new Price (56144, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.71, StatusEnum.ONLINE, new Date(2022,05,27)));
        postingCollections.add(new Posting(10410020, "Departamento en alquiler", new Price (44102, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.82, StatusEnum.DRAFT, new Date(2022,05,6)));
        postingCollections.add(new Posting(10410021, "Casa en venta", new Price (24911, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.51, StatusEnum.OFFLINE, new Date(2022,05,7)));
        postingCollections.add(new Posting(10410022, "Casa en alquiler", new Price (156529, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.4, StatusEnum.OFFLINE, new Date(2022,05,2)));
        postingCollections.add(new Posting(10410023, "Departamento en alquiler", new Price (42128, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.79, StatusEnum.ONLINE, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410024, "Garaje en alquiler", new Price (16461, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.13, StatusEnum.DRAFT, new Date(2022,05,25)));
        postingCollections.add(new Posting(10410025, "local en alquiler", new Price (81023, CurrencyEnum.REALES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.56, StatusEnum.ONLINE, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410026, "Casa en venta", new Price (155501, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.28, StatusEnum.DRAFT, new Date(2022,05,23)));
        postingCollections.add(new Posting(10410027, "Departamento en venta", new Price (90974, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.58, StatusEnum.DRAFT, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410028, "Garaje en venta", new Price (52076, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.24, StatusEnum.OFFLINE, new Date(2022,05,3)));
        postingCollections.add(new Posting(10410029, "Casa en alquiler temporal", new Price (61477, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.9, StatusEnum.DRAFT, new Date(2022,05,22)));
        postingCollections.add(new Posting(10410030, "Departamento en alquiler temporal", new Price (147451, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.02, StatusEnum.ONLINE, new Date(2022,05,14)));
        postingCollections.add(new Posting(10410031, "Departamento en alquiler", new Price (6217, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.85, StatusEnum.DRAFT, new Date(2022,05,25)));
        postingCollections.add(new Posting(10410032, "Casa en venta", new Price (164556, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.14, StatusEnum.OFFLINE, new Date(2022,05,20)));
        postingCollections.add(new Posting(10410033, "Casa en alquiler", new Price (136805, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.63, StatusEnum.OFFLINE, new Date(2022,05,30)));
        postingCollections.add(new Posting(10410034, "Departamento en alquiler", new Price (6122, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.2, StatusEnum.ONLINE, new Date(2022,05,15)));
        postingCollections.add(new Posting(10410035, "Garaje en alquiler", new Price (155722, CurrencyEnum.PESOS), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.4, StatusEnum.DRAFT, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410036, "local en alquiler", new Price (69621, CurrencyEnum.REALES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.09, StatusEnum.ONLINE, new Date(2022,05,15)));
        postingCollections.add(new Posting(10410037, "Casa en venta", new Price (147001, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.63, StatusEnum.DRAFT, new Date(2022,05,25)));
        postingCollections.add(new Posting(10410038, "Departamento en venta", new Price (96344, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.59, StatusEnum.DRAFT, new Date(2022,05,23)));
        postingCollections.add(new Posting(10410039, "Garaje en venta", new Price (101782, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.27, StatusEnum.OFFLINE, new Date(2022,05,30)));
        postingCollections.add(new Posting(10410040, "Casa en alquiler temporal", new Price (170930, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.01, StatusEnum.DRAFT, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410041, "Departamento en alquiler temporal", new Price (3752, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.74, StatusEnum.ONLINE, new Date(2022,05,5)));
        postingCollections.add(new Posting(10410042, "Departamento en alquiler", new Price (119588, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.44, StatusEnum.DRAFT, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410043, "Casa en venta", new Price (136616, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.4, StatusEnum.OFFLINE, new Date(2022,05,1)));
        postingCollections.add(new Posting(10410044, "Casa en alquiler", new Price (74643, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.7, StatusEnum.OFFLINE, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410045, "Departamento en alquiler", new Price (118498, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.42, StatusEnum.ONLINE, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410046, "Garaje en alquiler", new Price (81356, CurrencyEnum.SOLES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.34, StatusEnum.DRAFT, new Date(2022,05,20)));
        postingCollections.add(new Posting(10410047, "local en alquiler", new Price (105030, CurrencyEnum.SOLES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.5, StatusEnum.ONLINE, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410048, "Casa en venta", new Price (135698, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.69, StatusEnum.DRAFT, new Date(2022,05,1)));
        postingCollections.add(new Posting(10410049, "Departamento en venta", new Price (105879, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.27, StatusEnum.DRAFT, new Date(2022,05,20)));
        postingCollections.add(new Posting(10410050, "Garaje en venta", new Price (134029, CurrencyEnum.PESOS), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.49, StatusEnum.OFFLINE, new Date(2022,05,12)));
        postingCollections.add(new Posting(10410051, "Casa en alquiler temporal", new Price (89631, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.98, StatusEnum.DRAFT, new Date(2022,05,18)));
        postingCollections.add(new Posting(10410052, "Departamento en alquiler temporal", new Price (192016, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.64, StatusEnum.ONLINE, new Date(2022,05,8)));
        postingCollections.add(new Posting(10410053, "Departamento en alquiler", new Price (92010, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.42, StatusEnum.DRAFT, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410054, "Casa en venta", new Price (115322, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.11, StatusEnum.OFFLINE, new Date(2022,05,3)));
        postingCollections.add(new Posting(10410055, "Casa en alquiler", new Price (196727, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.6, StatusEnum.OFFLINE, new Date(2022,05,5)));
        postingCollections.add(new Posting(10410056, "Departamento en alquiler", new Price (18318, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.09, StatusEnum.ONLINE, new Date(2022,05,1)));
        postingCollections.add(new Posting(10410057, "Garaje en alquiler", new Price (192591, CurrencyEnum.DOLARES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.73, StatusEnum.DRAFT, new Date(2022,05,12)));
        postingCollections.add(new Posting(10410058, "local en alquiler", new Price (18540, CurrencyEnum.DOLARES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.03, StatusEnum.ONLINE, new Date(2022,05,22)));
        postingCollections.add(new Posting(10410059, "Casa en venta", new Price (71297, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.9, StatusEnum.DRAFT, new Date(2022,05,21)));
        postingCollections.add(new Posting(10410060, "Departamento en venta", new Price (119690, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.92, StatusEnum.DRAFT, new Date(2022,05,16)));
        postingCollections.add(new Posting(10410061, "Garaje en venta", new Price (166398, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.37, StatusEnum.OFFLINE, new Date(2022,05,23)));
        postingCollections.add(new Posting(10410062, "Casa en alquiler temporal", new Price (192501, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.79, StatusEnum.DRAFT, new Date(2022,05,30)));
        postingCollections.add(new Posting(10410063, "Departamento en alquiler temporal", new Price (150945, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.84, StatusEnum.ONLINE, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410064, "Departamento en alquiler", new Price (181613, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.37, StatusEnum.DRAFT, new Date(2022,05,2)));
        postingCollections.add(new Posting(10410065, "Casa en venta", new Price (10012, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.8, StatusEnum.OFFLINE, new Date(2022,05,25)));
        postingCollections.add(new Posting(10410066, "Casa en alquiler", new Price (149252, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.16, StatusEnum.OFFLINE, new Date(2022,05,7)));
        postingCollections.add(new Posting(10410067, "Departamento en alquiler", new Price (71583, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.55, StatusEnum.ONLINE, new Date(2022,05,6)));
        postingCollections.add(new Posting(10410068, "Garaje en alquiler", new Price (175924, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.51, StatusEnum.DRAFT, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410069, "local en alquiler", new Price (105822, CurrencyEnum.REALES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.12, StatusEnum.ONLINE, new Date(2022,05,3)));
        postingCollections.add(new Posting(10410070, "Casa en venta", new Price (43579, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.8, StatusEnum.DRAFT, new Date(2022,05,24)));
        postingCollections.add(new Posting(10410071, "Departamento en venta", new Price (135885, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.88, StatusEnum.DRAFT, new Date(2022,05,22)));
        postingCollections.add(new Posting(10410072, "Garaje en venta", new Price (119856, CurrencyEnum.DOLARES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.98, StatusEnum.OFFLINE, new Date(2022,05,16)));
        postingCollections.add(new Posting(10410073, "Casa en alquiler temporal", new Price (49338, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.37, StatusEnum.DRAFT, new Date(2022,05,22)));
        postingCollections.add(new Posting(10410074, "Departamento en alquiler temporal", new Price (75720, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.31, StatusEnum.ONLINE, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410075, "Departamento en alquiler", new Price (146043, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.24, StatusEnum.DRAFT, new Date(2022,05,10)));
        postingCollections.add(new Posting(10410076, "Casa en venta", new Price (41255, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.2, StatusEnum.OFFLINE, new Date(2022,05,7)));
        postingCollections.add(new Posting(10410077, "Casa en alquiler", new Price (55764, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.77, StatusEnum.OFFLINE, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410078, "Departamento en alquiler", new Price (107767, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.42, StatusEnum.ONLINE, new Date(2022,05,24)));
        postingCollections.add(new Posting(10410079, "Garaje en alquiler", new Price (164322, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.23, StatusEnum.DRAFT, new Date(2022,05,8)));
        postingCollections.add(new Posting(10410080, "local en alquiler", new Price (125985, CurrencyEnum.SOLES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.03, StatusEnum.ONLINE, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410081, "Casa en venta", new Price (168416, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.72, StatusEnum.DRAFT, new Date(2022,05,22)));
        postingCollections.add(new Posting(10410082, "Departamento en venta", new Price (197867, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.52, StatusEnum.DRAFT, new Date(2022,05,8)));
        postingCollections.add(new Posting(10410083, "Garaje en venta", new Price (98135, CurrencyEnum.SOLES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.79, StatusEnum.OFFLINE, new Date(2022,05,15)));
        postingCollections.add(new Posting(10410084, "Casa en alquiler temporal", new Price (74619, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.3, StatusEnum.DRAFT, new Date(2022,05,26)));
        postingCollections.add(new Posting(10410085, "Departamento en alquiler temporal", new Price (14181, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.14, StatusEnum.ONLINE, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410086, "Departamento en alquiler", new Price (106554, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.09, StatusEnum.DRAFT, new Date(2022,05,12)));
        postingCollections.add(new Posting(10410087, "Casa en venta", new Price (56963, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.84, StatusEnum.OFFLINE, new Date(2022,05,3)));
        postingCollections.add(new Posting(10410088, "Casa en alquiler", new Price (155655, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.06, StatusEnum.OFFLINE, new Date(2022,05,10)));
        postingCollections.add(new Posting(10410089, "Departamento en alquiler", new Price (101573, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.93, StatusEnum.ONLINE, new Date(2022,05,8)));
        postingCollections.add(new Posting(10410090, "Garaje en alquiler", new Price (76386, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.62, StatusEnum.DRAFT, new Date(2022,05,6)));
        postingCollections.add(new Posting(10410091, "local en alquiler", new Price (102384, CurrencyEnum.REALES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.95, StatusEnum.ONLINE, new Date(2022,05,5)));
        postingCollections.add(new Posting(10410092, "Casa en venta", new Price (182732, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.54, StatusEnum.DRAFT, new Date(2022,05,17)));
        postingCollections.add(new Posting(10410093, "Departamento en venta", new Price (8178, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.26, StatusEnum.DRAFT, new Date(2022,05,27)));
        postingCollections.add(new Posting(10410094, "Garaje en venta", new Price (11453, CurrencyEnum.PESOS), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.06, StatusEnum.OFFLINE, new Date(2022,05,20)));
        postingCollections.add(new Posting(10410095, "Casa en alquiler temporal", new Price (40764, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.08, StatusEnum.DRAFT, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410096, "Departamento en alquiler temporal", new Price (145677, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.31, StatusEnum.ONLINE, new Date(2022,05,13)));
        postingCollections.add(new Posting(10410097, "Departamento en alquiler", new Price (151398, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.03, StatusEnum.DRAFT, new Date(2022,05,4)));
        postingCollections.add(new Posting(10410098, "Casa en venta", new Price (84348, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.5, StatusEnum.OFFLINE, new Date(2022,05,12)));
        postingCollections.add(new Posting(10410099, "Casa en alquiler", new Price (126791, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.44, StatusEnum.OFFLINE, new Date(2022,05,20)));
        postingCollections.add(new Posting(10410100, "Departamento en alquiler", new Price (27640, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.97, StatusEnum.ONLINE, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410101, "Garaje en alquiler", new Price (190270, CurrencyEnum.DOLARES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.08, StatusEnum.DRAFT, new Date(2022,05,13)));
        postingCollections.add(new Posting(10410102, "local en alquiler", new Price (88811, CurrencyEnum.REALES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.04, StatusEnum.ONLINE, new Date(2022,05,24)));
        postingCollections.add(new Posting(10410103, "Casa en venta", new Price (163988, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.28, StatusEnum.DRAFT, new Date(2022,05,18)));
        postingCollections.add(new Posting(10410104, "Departamento en venta", new Price (124089, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.84, StatusEnum.DRAFT, new Date(2022,05,10)));
        postingCollections.add(new Posting(10410105, "Garaje en venta", new Price (7959, CurrencyEnum.SOLES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.58, StatusEnum.OFFLINE, new Date(2022,05,30)));
        postingCollections.add(new Posting(10410106, "Casa en alquiler temporal", new Price (23416, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.54, StatusEnum.DRAFT, new Date(2022,05,22)));
        postingCollections.add(new Posting(10410107, "Departamento en alquiler temporal", new Price (42684, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.56, StatusEnum.ONLINE, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410108, "Departamento en alquiler", new Price (29073, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.06, StatusEnum.DRAFT, new Date(2022,05,29)));
        postingCollections.add(new Posting(10410109, "Casa en venta", new Price (118112, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.66, StatusEnum.OFFLINE, new Date(2022,05,24)));
        postingCollections.add(new Posting(10410110, "Casa en alquiler", new Price (137501, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.58, StatusEnum.OFFLINE, new Date(2022,05,15)));
        postingCollections.add(new Posting(10410111, "Departamento en alquiler", new Price (142563, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.78, StatusEnum.ONLINE, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410112, "Garaje en alquiler", new Price (90875, CurrencyEnum.DOLARES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.35, StatusEnum.DRAFT, new Date(2022,05,29)));
        postingCollections.add(new Posting(10410113, "local en alquiler", new Price (58695, CurrencyEnum.DOLARES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.59, StatusEnum.ONLINE, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410114, "Casa en venta", new Price (118908, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.83, StatusEnum.DRAFT, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410115, "Departamento en venta", new Price (170907, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.7, StatusEnum.DRAFT, new Date(2022,05,24)));
        postingCollections.add(new Posting(10410116, "Garaje en venta", new Price (80964, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.21, StatusEnum.OFFLINE, new Date(2022,05,23)));
        postingCollections.add(new Posting(10410117, "Casa en alquiler temporal", new Price (113299, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.45, StatusEnum.DRAFT, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410118, "Departamento en alquiler temporal", new Price (75076, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.46, StatusEnum.ONLINE, new Date(2022,05,5)));
        postingCollections.add(new Posting(10410119, "Departamento en alquiler", new Price (108026, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.05, StatusEnum.DRAFT, new Date(2022,05,25)));
        postingCollections.add(new Posting(10410120, "Casa en venta", new Price (96087, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.5, StatusEnum.OFFLINE, new Date(2022,05,2)));
        postingCollections.add(new Posting(10410121, "Casa en alquiler", new Price (49957, CurrencyEnum.SOLES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.14, StatusEnum.OFFLINE, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410122, "Departamento en alquiler", new Price (106627, CurrencyEnum.SOLES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.74, StatusEnum.ONLINE, new Date(2022,05,12)));
        postingCollections.add(new Posting(10410123, "Garaje en alquiler", new Price (73021, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.31, StatusEnum.DRAFT, new Date(2022,05,29)));
        postingCollections.add(new Posting(10410124, "local en alquiler", new Price (115307, CurrencyEnum.REALES), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.14, StatusEnum.ONLINE, new Date(2022,05,28)));
        postingCollections.add(new Posting(10410125, "Casa en venta", new Price (82584, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.47, StatusEnum.DRAFT, new Date(2022,05,6)));
        postingCollections.add(new Posting(10410126, "Departamento en venta", new Price (97710, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.33, StatusEnum.DRAFT, new Date(2022,05,21)));
        postingCollections.add(new Posting(10410127, "Garaje en venta", new Price (190089, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.35, StatusEnum.OFFLINE, new Date(2022,05,16)));
        postingCollections.add(new Posting(10410128, "Casa en alquiler temporal", new Price (195901, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.92, StatusEnum.DRAFT, new Date(2022,05,24)));
        postingCollections.add(new Posting(10410129, "Departamento en alquiler temporal", new Price (159929, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.93, StatusEnum.ONLINE, new Date(2022,05,27)));
        postingCollections.add(new Posting(10410130, "Departamento en alquiler", new Price (134180, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.07, StatusEnum.DRAFT, new Date(2022,05,6)));
        postingCollections.add(new Posting(10410131, "Casa en venta", new Price (12938, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.93, StatusEnum.OFFLINE, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410132, "Casa en alquiler", new Price (129216, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.13, StatusEnum.OFFLINE, new Date(2022,05,26)));
        postingCollections.add(new Posting(10410133, "Departamento en alquiler", new Price (189621, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.52, StatusEnum.ONLINE, new Date(2022,05,9)));
        postingCollections.add(new Posting(10410134, "Garaje en alquiler", new Price (81996, CurrencyEnum.PESOS), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.31, StatusEnum.DRAFT, new Date(2022,05,7)));
        postingCollections.add(new Posting(10410135, "local en alquiler", new Price (100625, CurrencyEnum.PESOS), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.02, StatusEnum.ONLINE, new Date(2022,05,17)));
        postingCollections.add(new Posting(10410136, "Casa en venta", new Price (16839, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.37, StatusEnum.DRAFT, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410137, "Departamento en venta", new Price (40413, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.69, StatusEnum.DRAFT, new Date(2022,05,29)));
        postingCollections.add(new Posting(10410138, "Garaje en venta", new Price (85210, CurrencyEnum.REALES), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.8, StatusEnum.OFFLINE, new Date(2022,05,11)));
        postingCollections.add(new Posting(10410139, "Casa en alquiler temporal", new Price (12153, CurrencyEnum.REALES), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.53, StatusEnum.DRAFT, new Date(2022,05,13)));
        postingCollections.add(new Posting(10410140, "Departamento en alquiler temporal", new Price (126828, CurrencyEnum.REALES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.02, StatusEnum.ONLINE, new Date(2022,05,10)));
        postingCollections.add(new Posting(10410141, "Departamento en alquiler", new Price (54091, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.73, StatusEnum.DRAFT, new Date(2022,05,21)));
        postingCollections.add(new Posting(10410142, "Casa en venta", new Price (135427, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.31, StatusEnum.OFFLINE, new Date(2022,05,19)));
        postingCollections.add(new Posting(10410143, "Casa en alquiler", new Price (134632, CurrencyEnum.DOLARES), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.32, StatusEnum.OFFLINE, new Date(2022,05,8)));
        postingCollections.add(new Posting(10410144, "Departamento en alquiler", new Price (96198, CurrencyEnum.DOLARES), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.7, StatusEnum.ONLINE, new Date(2022,05,4)));
        postingCollections.add(new Posting(10410145, "Garaje en alquiler", new Price (190703, CurrencyEnum.SOLES), RealestateTypeEnum.GARAGE, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.2, StatusEnum.DRAFT, new Date(2022,05,25)));
        postingCollections.add(new Posting(10410146, "local en alquiler", new Price (153771, CurrencyEnum.PESOS), RealestateTypeEnum.COMERCIAL, OperationTypeEnum.RENT, PostingType.UNIT, 0.99, StatusEnum.ONLINE, new Date(2022,05,4)));
        postingCollections.add(new Posting(10410147, "Casa en venta", new Price (28496, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.22, StatusEnum.DRAFT, new Date(2022,05,15)));
        postingCollections.add(new Posting(10410148, "Departamento en venta", new Price (79435, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT, 0.39, StatusEnum.DRAFT, new Date(2022,05,16)));
        postingCollections.add(new Posting(10410149, "Garaje en venta", new Price (169832, CurrencyEnum.PESOS), RealestateTypeEnum.GARAGE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.94, StatusEnum.OFFLINE, new Date(2022,05,7)));
        postingCollections.add(new Posting(10410150, "Casa en alquiler temporal", new Price (73135, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.25, StatusEnum.DRAFT, new Date(2022,05,10)));
        postingCollections.add(new Posting(10410151, "Departamento en alquiler temporal", new Price (78434, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.TEMPORAL, PostingType.PROPERTY, 0.49, StatusEnum.ONLINE, new Date(2022,05,18)));
        postingCollections.add(new Posting(10410152, "Departamento en alquiler", new Price (52428, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY, 0.55, StatusEnum.DRAFT, new Date(2022,05,15)));
        postingCollections.add(new Posting(10410153, "Casa en venta", new Price (126535, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY, 0.38, StatusEnum.OFFLINE, new Date(2022,05,1)));
    }

    private static void splitPublisherByCountry(){
        Collection<Publisher> allPublishers = PublisherUtils.getPublishers();
        publisherArg = new ArrayList<>();
        publisherBr = new ArrayList<>();
        publisherMx = new ArrayList<>();
        publisherPe = new ArrayList<>();

        for(Publisher publisher: allPublishers) {
            if(CountryEnum.AR.equals(publisher.getCountry())) {
                publisherArg.add(publisher);
            } else if (CountryEnum.BR.equals(publisher.getCountry())) {
                publisherBr.add(publisher);
            } else if (CountryEnum.MX.equals(publisher.getCountry())) {
                publisherMx.add(publisher);
            } else if(CountryEnum.PE.equals(publisher.getCountry())) {
                publisherPe.add(publisher);
            }
        }
    }
    private static void loadPublishersForPosting() {
        loadPosting();
        splitPublisherByCountry();

        int posArg = 0;
        int posMx = 0;
        int posBr = 0;
        int posPe = 0;

        for(Posting posting: postingCollections) {
            if(CurrencyEnum.PESOS.equals(posting.getPrice().getCurrency())) {
                posting.setPublisher(publisherArg.get(posArg));
                posArg = posArg < publisherArg.size() -1 ? posArg + 1 : 0;
            } else if (CurrencyEnum.DOLARES.equals(posting.getPrice().getCurrency())) {
                posting.setPublisher(publisherMx.get(posMx));
                posMx = posMx < publisherMx.size() -1 ? posMx + 1 : 0;
            } else if (CurrencyEnum.REALES.equals(posting.getPrice().getCurrency())) {
                posting.setPublisher(publisherBr.get(posBr));
                posBr = posBr < publisherBr.size() -1 ? posBr + 1 : 0;
            } else if (CurrencyEnum.SOLES.equals(posting.getPrice().getCurrency())) {
                posting.setPublisher(publisherPe.get(posPe));
                posPe = posPe < publisherPe.size() -1 ? posPe + 1 : 0;
            }
        }
    }

    public static Collection<Posting> getListPostings(){
        loadPublishersForPosting();
        return postingCollections;
    }
}
