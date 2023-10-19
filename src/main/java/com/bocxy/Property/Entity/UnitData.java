package com.bocxy.Property.Entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "unitData")
public class UnitData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "N_ID")
    private Long N_ID;

    @Column(name = "N_SCHEME_ID")
    private Long N_SCHEME_ID;

    //New and confirmed Entries

    @Column(name = "V_CATEGORY", length = 45)
    private String V_CATEGORY;

    @Column(name = "V_ROAD_FACING", length = 45)
    private String V_ROAD_FACING;

    @Column(name = "V_CORNER_PLOT_STATUS", length = 45)
    private String V_CORNER_PLOT_STATUS;

    @Column(name = "V_UNIT_ALLOTTED_STATUS", length = 45)
    private String V_UNIT_ALLOTTED_STATUS;

    @Column(name = "V_UNIT_NO", length = 45)
    private String V_UNIT_NO;

    @Column(name = "V_BLOCK_NO", length = 45)
    private String V_BLOCK_NO;

    @Column(name = "V_FLOOR_NO", length = 45)
    private String V_FLOOR_NO;

    @Column(name = "V_UNIT_COST", length = 45)
    private String V_UNIT_COST;

    @Column(name = "V_UNIT_AC_NO", length = 45)
    private String V_UNIT_AC_NO;

    @Column(name = "V_RESERVATION_CATEGORY", length = 45)
    private String V_RESERVATION_CATEGORY;

    @Column(name = "V_PRIORITY", length = 45)
    private String V_PRIORITY;

    @Column(name = "V_INITIAL_DEPOSIT", length = 45)
    private String V_INITIAL_DEPOSIT;

    @Column(name = "V_EMI", length = 45)
    private String V_EMI;

    @Column(name = "V_EMI_START_DATE", length = 45)
    private String V_EMI_START_DATE;

    @Column(name = "GDQ", length = 45)
    private String GDQ;

    @Column(name = "V_DATE_OF_ALLOTMENT", length = 45)
    private String V_DATE_OF_ALLOTMENT;

    @Column(name = "V_FREEZED_DATE", length = 45)
    private String V_FREEZED_DATE;

    @Column(name = "V_UNIT_READY_DATE", length = 45)
    private String V_UNIT_READY_DATE;

    @Column(name = "V_ID_DUE_DATE_HP", length = 45)
    private String V_ID_DUE_DATE_HP;

    @Column(name = "V_SF_LOAN_SG", length = 45)
    private String V_SF_LOAN_SG;

    @Column(name = "V_AB_ISSUED_DATE", length = 45)
    private String V_AB_ISSUED_DATE;

    @Column(name = "V_LOAN_SANC_DATE", length = 45)
    private String V_LOAN_SANC_DATE;

    @Column(name = "V_UNIT_HANDING_OVER", length = 45)
    private String V_UNIT_HANDING_OVER;

    @Column(name = "V_PLOT_HANDING_OVER", length = 45)
    private String V_PLOT_HANDING_OVER;

    @Column(name = "V_ACTUAL_EXTENT", length = 45)
    private String V_ACTUAL_EXTENT;

    @Column(name = "V_DOOR_FACING", length = 45)
    private String V_DOOR_FACING;

    @Column(name = "V_LIVE_STATUS", length = 45)
    private String V_LIVE_STATUS;

    @Column(name = "V_RIPED_STATUS", length = 45)
    private String V_RIPED_STATUS;

    @Column(name = "V_FC_PAID_STATUS", length = 45)
    private String V_FC_PAID_STATUS;

    @Column(name = "V_DRAFT_DEED_ISSUED_ON", length = 45)
    private String V_DRAFT_DEED_ISSUED_ON;

    @Column(name = "V_FC_PAID_BUT_SALE_DEED_NOT_ISSUED")
    private String V_FC_PAID_BUT_SALE_DEED_NOT_ISSUED;

    @Column(name = "V_RIPED_BUT_COST_NOT_FULLY_PAID")
    private String V_RIPED_BUT_COST_NOT_FULLY_PAID;

    @Column(name = "V_SALE_DEED_STATUS", length = 45)
    private String V_SALE_DEED_STATUS;

    @Column(name = "V_SALE_DEED_DATE", length = 45)
    private String V_SALE_DEED_DATE;

    @Column(name = "V_1ST_AMOUNT_DUE", length = 45)
    private String V_1ST_AMOUNT_DUE;

    @Column(name = "V_1ST_AMOUNT_DUE_DATE", length = 45)
    private String V_1ST_AMOUNT_DUE_DATE;

    @Column(name = "V_2ST_AMOUNT_DUE", length = 45)
    private String V_2ST_AMOUNT_DUE;

    @Column(name = "V_2ND_AMOUNT_DUE_DATE", length = 45)
    private String V_2ND_AMOUNT_DUE_DATE;

    @Column(name = "V_3RD_AMOUNT_DUE", length = 45)
    private String V_3RD_AMOUNT_DUE;

    @Column(name = "V_3RD_AMOUNT_DUE_DATE", length = 45)
    private String V_3RD_AMOUNT_DUE_DATE;

    @Column(name = "V_4TH_AMOUNT_DUE", length = 45)
    private String V_4TH_AMOUNT_DUE;

    @Column(name = "V_4TH_AMOUNT_DUE_DATE", length = 45)
    private String V_4TH_AMOUNT_DUE_DATE;

    @Column(name = "V_5TH_AMOUNT_DUE", length = 45)
    private String V_5TH_AMOUNT_DUE;

    @Column(name = "V_5TH_AMOUNT_DUE_DATE", length = 45)
    private String V_5TH_AMOUNT_DUE_DATE;

    @Column(name = "V_6TH_AMOUNT_DUE", length = 45)
    private String V_6TH_AMOUNT_DUE;

    @Column(name = "V_6TH_AMOUNT_DUE_DATE", length = 45)
    private String V_6TH_AMOUNT_DUE_DATE;

    @Column(name = "V_7TH_AMOUNT_DUE", length = 45)
    private String V_7TH_AMOUNT_DUE;

    @Column(name = "V_7TH_AMOUNT_DUE_DATE", length = 45)
    private String V_7TH_AMOUNT_DUE_DATE;

    @Column(name = "V_8TH_AMOUNT_DUE", length = 45)
    private String V_8TH_AMOUNT_DUE;

    @Column(name = "V_8TH_AMOUNT_DUE_DATE", length = 45)
    private String V_8TH_AMOUNT_DUE_DATE;

    @Column(name = "V_9TH_AMOUNT_DUE", length = 45)
    private String V_9TH_AMOUNT_DUE;

    @Column(name = "V_9TH_AMOUNT_DUE_DATE", length = 45)
    private String V_9TH_AMOUNT_DUE_DATE;

    @Column(name = "V_10TH_AMOUNT_DUE", length = 45)
    private String V_10TH_AMOUNT_DUE;

    @Column(name = "V_10TH_AMOUNT_DUE_DATE", length = 45)
    private String V_10TH_AMOUNT_DUE_DATE;

    @Column(name = "V_11TH_AMOUNT_DUE", length = 45)
    private String V_11TH_AMOUNT_DUE;

    @Column(name = "V_11TH_AMOUNT_DUE_DATE", length = 45)
    private String V_11TH_AMOUNT_DUE_DATE;

    @Column(name = "V_12TH_AMOUNT_DUE", length = 45)
    private String V_12TH_AMOUNT_DUE;

    @Column(name = "V_12TH_AMOUNT_DUE_DATE", length = 45)
    private String V_12TH_AMOUNT_DUE_DATE;

    @Column(name = "V_13TH_AMOUNT_DUE", length = 45)
    private String V_13TH_AMOUNT_DUE;

    @Column(name = "V_13TH_AMOUNT_DUE_DATE", length = 45)
    private String V_13TH_AMOUNT_DUE_DATE;

    @Transient
    private String mode;

    //old Entity
    @Column(name = "V_TYPE_NAME", length = 45)
    private String V_TYPE_NAME;

    @Column(name = "V_UNIT_ID", length = 45)
    private String V_UNIT_ID;

    @Column(name = "V_ASSET_CATEGORY", length = 45)
    private String V_ASSET_CATEGORY;

    @Column(name = "VAssetSubCategory", length = 45)
    private String VAssetSubCategory;

    @Column(name = "V_ASSET_TYPE", length = 45)
    private String V_ASSET_TYPE;

    @Column(name = "V_PLINTH_AREA", length = 45)
    private String V_PLINTH_AREA;

    @Column(name = "V_UDS_AREA", length = 45)
    private String V_UDS_AREA;

    @Column(name = "V_PLOT_AREA", length = 45)
    private String V_PLOT_AREA;

    @Column(name = "V_CARPET_AREA", length = 45)
    private String V_CARPET_AREA;

    @Column(name = "V_GOVT_DISCRETION_QUOTA", length = 45)
    private String V_GOVT_DISCRETION_QUOTA;

    @Column(name = "V_ALLOTMENT_TYPE", length = 45)
    private String V_ALLOTMENT_TYPE;

    @Column(name = "V_FLAT_NO", length = 45)
    private String V_FLAT_NO;





}