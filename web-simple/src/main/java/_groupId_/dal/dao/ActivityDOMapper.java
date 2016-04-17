package _groupId_.dal.dao;

import _groupId_.dal.dataobject.ActivityDO;
import java.util.List;

public interface ActivityDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityDO record);

    ActivityDO selectByPrimaryKey(Long id);

    List<ActivityDO> selectAll();

    int updateByPrimaryKey(ActivityDO record);
}