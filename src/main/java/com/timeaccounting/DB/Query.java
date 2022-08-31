package com.timeaccounting.DB;

public class Query {
    public static final String SELECT_ALL_ACTIVITIES = "SELECT activity.id, activity.name_activity," +
            " activity.id_category, category.name_category\n" +
            " FROM activity join category on category.id = activity.id_category";
    public static final String ADD_ACTIVITY = "INSERT INTO activity VALUES(default, ?, ?)";
    public static final String DELETE_ACTIVITY = "DELETE FROM activity WHERE id = ?";
    public static final String UPDATE_ACTIVITY_BY_ID = "UPDATE activity SET name_activity = ?, id_category=? WHERE id=?";
    public static final String FIND_ACTIVITY_BY_NAME = "select * from activity where name_activity = ?";
    public static final String GET_ACTIVITY_DIVIDED_BY_PAGE = "SELECT activity.id, activity.name_activity, activity.id_category, category.name_category\n" +
            "FROM activity left outer join category on category.id = activity.id_category limit ";
    public static final String GET_COUNT_OF_ROWS_ACTIVITY_DAO = "SELECT COUNT(*) as count FROM activity";
    public static final String GET_ALL_ACTIVITIES_REPORT = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "count(user_activities.id_user) as user_count from activity\n" +
            "left outer join category on activity.id_category = category.id\n" +
            "join user_activities on user_activities.id_activity = activity.id \n" +
            "group by activity.name_activity, category.name_category";
    public static final String GET_ALL_SORT_ACTIVITIES = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "count(user_activities.id_user) as user_count from activity\n" +
            "left outer join category on activity.id_category = category.id \n" +
            "join user_activities on user_activities.id_activity = activity.id\n" +
            "group by activity.name_activity, category.name_category order by activity.name_activity ";
    public static final String GET_SORT_ACTIVITIES_BY_CATEGORY_ID = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "count(user_activities.id_user) as user_count from activity\n" +
            "left outer join category on activity.id_category = category.id \n" +
            "join user_activities on user_activities.id_activity = activity.id where category.id = ?\n" +
            "group by activity.name_activity, category.name_category order by activity.name_activity ";
    public static final String GET_ALL_SORT_CATEGORIES = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "count(user_activities.id_user) as user_count from activity\n" +
            "left outer join category on activity.id_category = category.id\n" +
            "join user_activities on user_activities.id_activity = activity.id \n" +
            "group by activity.name_activity, category.name_category order by category.name_category ASC";
    public static final String GET_ALL_SORT_CATEGORIES_BY_CATEGORY_ID = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "count(user_activities.id_user) as user_count from activity\n" +
            "left outer join category on activity.id_category = category.id\n" +
            "join user_activities on user_activities.id_activity = activity.id \n" +
            "group by activity.name_activity, category.name_category order by category.name_category DESC";
    public static final String GET_ALL_SORT_USER_COUNT = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "                                     count(user_activities.id_user) as user_count from activity\n" +
            "                                     left outer join category on activity.id_category = category.id\n" +
            "                                     join user_activities on user_activities.id_activity = activity.id \n" +
            "group by activity.name_activity, category.name_category order by user_count ";
    public static final String GET_ALL_SORT_USER_COUNT_BY_CATEGORY_ID = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "                                     count(user_activities.id_user) as user_count from activity\n" +
            "                                     left outer join category on activity.id_category = category.id\n" +
            "                                     join user_activities on user_activities.id_activity = activity.id where category.id = ?\n" +
            "  group by activity.name_activity, category.name_category order by user_count ";
    public static final String GET_ALL_FILTER_CATEGORY = "select activity.id, activity.name_activity as activity, category.name_category as category, \n" +
            "count(user_activities.id_user) as user_count from activity\n" +
            "left outer join category on activity.id_category = category.id \n" +
            "join user_activities on user_activities.id_activity = activity.id where category.id = ?\n" +
            "group by activity.name_activity, category.name_category";
    public static final String GET_ALL_CATEGORIES = "select * from category;";
    public static final String ADD_CATEGORY = "INSERT INTO category VALUES(default, ?, ?)";
    public static final String DELETE_CATEGORY_BY_ID = "DELETE FROM category WHERE id = ?";
    public static final String UPDATE_CATEGORY = "UPDATE category SET name_category = ? WHERE id=?";
    public static final String GET_CATEGORIES_DIVIDED_BY_PAGE = "select * from category limit ";
    public static final String GET_COUNT_OF_ROWS_CATEGORY = "SELECT COUNT(*) as count FROM category";
    public static final String FIND_USER_BY_LOGIN = "SELECT * FROM account where user_login = ?";
    public static final String GET_ALL_USERS = "select account.id,  account.user_login, user_role.name_user_role, account.user_role, account.user_password\n" +
            "from account join user_role on user_role.id = account.user_role;";
    public static final String GET_USERS_DIVIDED_BY_PAGE = "select account.id,  account.user_login, user_role.name_user_role,\n" +
            "account.user_role, account.user_password from account join \n" +
            "user_role on user_role.id = account.user_role limit ";
    public static final String REGISTER_USER = "INSERT INTO account VALUES(default, ?, ?, ?)";
    public static final String SET_NEW_PASSWORD = "UPDATE account SET user_password = ? WHERE id=?";
    public static final String DELETE_USER_BY_ID = "DELETE FROM account WHERE id = ?";
    public static final String GET_COUNT_OF_ROWS_USER_DAO = "SELECT COUNT(*) as count FROM account";

    public static final String GET_ALL_USER_ACTIVITIES = "select user_activities.id as userActivityId,\n" +
            "user_activities.id_user as userActivityIdUser,\n" +
            "user_activities.id_activity as userActivityActivityId,\n" +
            "account.user_login as userLogin,\n" +
            "activity.name_activity as nameActivity, user_activities.state as state, user_activities.on_delete as onDelete , user_activities.spent_time as spentTime \n" +
            "from user_activities join account on account.id = user_activities.id_user join activity on\n" +
            "activity.id = user_activities.id_activity";
    public static final String GET_ALL_USER_ACTIVITIES_BY_USER_ID = "select user_activities.id as userActivityId, user_activities.id_user as userActivityIdUser,\n" +
            "user_activities.id_activity as userActivityActivityId, account.user_login as userLogin,\n" +
            "activity.name_activity as nameActivity, user_activities.state as state, user_activities.on_delete as onDelete , user_activities.spent_time as spentTime from user_activities join account on \n" +
            "account.id = user_activities.id_user join activity on activity.id = user_activities.id_activity\n" +
            "where user_activities.state = 1 and account.id = ? ";
    public static final String GET_ALL_USER_ACTIVITIES_BY_USER_ID_WITH_LIMIT = "select user_activities.id as userActivityId, user_activities.id_user as userActivityIdUser,\n" +
            "user_activities.id_activity as userActivityActivityId, account.user_login as userLogin,\n" +
            "activity.name_activity as nameActivity, user_activities.state as state, user_activities.on_delete as onDelete , user_activities.spent_time as spentTime from user_activities join account on \n" +
            "account.id = user_activities.id_user join activity on activity.id = user_activities.id_activity\n" +
            "where user_activities.state = 1 and account.id = ? limit ";
    public static final String GET_ALL_UN_ACTIVE_ACTIVITIES_BY_USER_ID = "select user_activities.id as userActivityId, user_activities.id_user as userActivityIdUser,\n" +
            "user_activities.id_activity as userActivityActivityId,  account.user_login as userLogin,\n" +
            " activity.name_activity as nameActivity, user_activities.state\n" +
            " as state, user_activities.on_delete as onDelete, user_activities.spent_time as spentTime\n" +
            "from user_activities join account on account.id = user_activities.id_user join activity on\n" +
            "activity.id = user_activities.id_activity where user_activities.state = 0 and account.id = ?";
    public static final String GET_ALL_UN_ACTIVE_ACTIVITIES_BY_USER_ID_LIMIT = "select user_activities.id as userActivityId, user_activities.id_user as userActivityIdUser,\n" +
            "user_activities.id_activity as userActivityActivityId,  account.user_login as userLogin,\n" +
            " activity.name_activity as nameActivity, user_activities.state\n" +
            " as state, user_activities.on_delete as onDelete, user_activities.spent_time as spentTime\n" +
            "from user_activities join account on account.id = user_activities.id_user join activity on\n" +
            "activity.id = user_activities.id_activity where user_activities.state = 0 and account.id = ? limit ";
    public static final String SET_USER_ACTIVITY = "INSERT INTO user_activities VALUES(default, ? , ? , 0, 1, 0)";
    public static final String SET_ON_DELETE = "UPDATE user_activities SET on_delete = 1 WHERE id_user = ? and  id = ? LIMIT 100;";
    public static final String SET_USER_TIME = "UPDATE user_activities SET spent_time = ? WHERE id = ? LIMIT 100";
    public static final String SET_USER_ACTIVITY_FROM_USER_SIDE = "INSERT INTO user_activities VALUES(default, ? , ? , 0, 0, 0)";
    public static final String MAKE_ACTIVITY_ACTIVE = "UPDATE user_activities SET state = 1 WHERE id=?";
    public static final String DELETE_USER_ACTIVITY = "DELETE FROM user_activities WHERE id = ?";
    public static final String UPDATE_USER_ACTIVITY = "UPDATE user_activities SET id_user = ?, id_activity = ? WHERE id=?";
    public static final String GET_ACTIVITY_ID = "select id_activity from user_activities where id = ?";
    public static final String GET_COUNT_OF_ACTIVITIES_BY_CATEGORY_ID = "select COUNT(id_user) as countOfActivities from user_activities where id_activity = ?";
    public static final String GET_USER_ACTIVITIES_DIVIDED_BY_PAGE = "select user_activities.id as userActivityId,\n" +
            "user_activities.id_user as userActivityIdUser,\n" +
            "user_activities.id_activity as userActivityActivityId,\n" +
            "account.user_login as userLogin,\n" +
            "activity.name_activity as nameActivity, user_activities.state as state, user_activities.on_delete as onDelete , user_activities.spent_time as spentTime \n" +
            "from user_activities join account on account.id = user_activities.id_user join activity on\n" +
            "activity.id = user_activities.id_activity limit ";
    public static final String GET_COUNT_OF_ROWS_USER_ACTIVITIES = "SELECT COUNT(*) as count FROM user_activities";
    public static final String GET_COUNT_OF_ROWS_USER_ACTIVITIES_BY_USER_ID = "SELECT COUNT(*) as count FROM user_activities where id_user = ? and state = 1";
    public static final String GET_USERS_REPORT = "select account.user_login as userLogin, count(user_activities.id_activity) as activityCount,\n" +
            "TIME(SUM(TIMEDIFF(user_activities.spent_time, '00:00:00'))) as spentTime from account left outer join \n" +
            "user_activities on account.id = user_activities.id_user \n" +
            "group by account.user_login";
    public static final String GET_USER_ROLES = "select * from user_role";



}
