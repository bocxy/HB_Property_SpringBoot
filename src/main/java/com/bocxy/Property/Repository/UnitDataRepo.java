package com.bocxy.Property.Repository;
import com.bocxy.Property.Entity.UnitData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Repository
public interface UnitDataRepo extends JpaRepository<UnitData, Long> {
    @Query("SELECT u FROM UnitData u WHERE u.N_SCHEME_ID = :nSchemeId")
    List<UnitData> findByNSchemeId(@RequestParam("nSchemeId") Long nSchemeId);
    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long updateTotalAllottedUnits(@RequestParam("schemeId") Long schemeId);

    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.V_ASSET_TYPE ='Residential' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedResidential(@RequestParam("schemeId") Long schemeId);
    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.V_ASSET_TYPE = 'Commercial' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedCommercial(@RequestParam("schemeId") Long schemeId);

    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.V_TYPE_NAME = 'Hire Purchase' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allotedHirePurchase(@RequestParam("schemeId") Long schemeId);

    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.V_TYPE_NAME ='Self Finance' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedSelfFinance(@RequestParam("schemeId") Long schemeId);
    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.V_TYPE_NAME ='Outright' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedOutright(@RequestParam("schemeId") Long schemeId);
    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.VAssetSubCategory = 'HIG' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedHIG(@RequestParam("schemeId") Long schemeId);
    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.VAssetSubCategory ='MIG' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedMIG(@RequestParam("schemeId") Long schemeId);
    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.VAssetSubCategory ='LIG' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedLIG(@RequestParam("schemeId") Long schemeId);
    @Query("SELECT COUNT(u) FROM UnitData u JOIN SchemeData s ON u.N_SCHEME_ID = s.N_ID WHERE u.N_SCHEME_ID = :schemeId AND u.VAssetSubCategory ='EWS' AND u.V_UNIT_ALLOTTED_STATUS = 'yes'")
    Long allottedEWS(@RequestParam("schemeId") Long schemeId);

    @Query("SELECT u.V_UNIT_AC_NO, u.VAssetSubCategory, u.V_TYPE_NAME, s.V_CITY_RURAL, s.V_CIRCLE, s.V_SCHEME_NAME,\n" +
            "s.V_UNIT_TYPE, u.V_BLOCK_NO, u.V_FLOOR_NO, u.V_FLAT_NO, u.V_UNIT_NO,\n" +
            "u.V_PLOT_AREA, u.V_UDS_AREA, u.V_PLINTH_AREA, u.V_UNIT_COST\n" +
            "FROM UnitData u \n" +
            "JOIN SchemeData s \n" +
            "ON u.N_SCHEME_ID = s.N_ID\n" +
            "WHERE u.N_ID = :unitId")
    List<Object[]> findUnitScheme(@RequestParam("unitId") Long unitId);

    @Query("SELECT u.V_BLOCK_NO, u.V_ASSET_TYPE, " +
            "u.V_FLOOR_NO, u.V_UNIT_NO, u.V_UNIT_ALLOTTED_STATUS, u.N_ID, u.V_UNIT_COST " +
            "FROM UnitData u " +
            "WHERE u.N_SCHEME_ID = :scheme GROUP BY\n" +
            "    u.V_BLOCK_NO,\n" +
            "    u.V_ASSET_TYPE,\n" +
            "    u.V_FLOOR_NO,\n" +
            "    u.V_UNIT_NO,\n" +
            "    u.V_UNIT_ALLOTTED_STATUS,\n" +
            "    u.N_ID,\n" +
            "    u.V_UNIT_COST\n" +
            "ORDER BY\n" +
            "    u.V_BLOCK_NO,\n" +
            "    u.V_ASSET_TYPE,\n" +
            "    u.V_FLOOR_NO,\n" +
            "    u.V_UNIT_NO")
    List<Object[]> findPropertyData(@RequestParam("scheme") Long scheme);

}