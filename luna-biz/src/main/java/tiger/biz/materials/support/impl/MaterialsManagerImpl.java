/**
 * Gambition Inc.
 * All Right Reserved.
 */
package tiger.biz.materials.support.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.biz.materials.support.MaterialsManager;
import tiger.common.dal.persistence.materials.Materials;
import tiger.core.basic.PageResult;
import tiger.core.service.materials.MaterialsService;

import java.util.List;

/**
 * @Author: [mondooo.cgq]
 * @version: [V 0.1.1]
 * @CreateDate: [2016/12/8 07:06]
 */
@Service
public class MaterialsManagerImpl implements MaterialsManager {

    @Autowired
    MaterialsService materialsService;

    @Override
    public PageResult<List<Materials>> getAll() {

        return new PageResult<>(materialsService.getAll());
    }
}