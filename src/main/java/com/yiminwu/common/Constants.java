/*******************************************************************************
 * PROPRIETARY/CONFIDENTIAL
 * Copyright (c) 2004-2009 WisageTech 
 *
 * All rights reserved. This medium contains confidential and proprietary
 * source code and other information which is the exclusive property of
 * WisageTech.  None of these materials may be used,
 * disclosed, transcribed, stored in a retrieval system, translated into
 * any other language or other computer language, or transmitted in any form
 * or by any means (electronic, mechanical, photocopied, recorded or
 * otherwise) without the prior written permission of WisageTech.
 *******************************************************************************
 *
 * $Header: /iManage/Betty/o2oPortlet/src/main/java/com/gearteks/framework/common/pos/Constants.java,v 1.1.2.7 2018/01/26 09:53:55 samchen Exp $
 * $Id: Constants.java,v 1.1.2.7 2018/01/26 09:53:55 samchen Exp $
 * $Author: samchen $
 * $Date: 2018/01/26 09:53:55 $
 * $Revision: 1.1.2.7 $
 * $Date: 2018/01/26 09:53:55 $
 * $Revision: 1.1.2.7 $
 *
 *******************************************************************************
 */
package com.yiminwu.common;

import java.util.Calendar;

/**
 * This class is to stored all global named contstants.
 * 
 * @author alexqiu
 */
public interface Constants {
   /**
    * DOCUMENT ME!
    */
   String SPLITTER_COL_EN_CN = ",\uff0c";

   String ACTION_TYPE = "actionType";

   String ACTION_TYPE_SUBMIT_FOR_APPROVAL = "submitForApproval";

   String URL_SEPARATOR = "/";

   String TREE_NODE_SEPARATOR = "|";

   String OID = "OID";

   String ADD = "add";

   String UPDATE = "update";

   String DELETE = "delete";

   String MOVE = "move";

   String RESIZE = "resize";

   String VIEW = "view";

   String LOG = "log";

   String BLANK = "blank";

   String COPY = "copy";

   String EDIT = "edit";

   String VIEWPOPU = "ViewPopu";

   String LIST = "list";

   String INFO = "info";

   String JS_SEPARATOR = "\\";

   String MAIN = "main";

   String REPORT = "report";

   String ACTION = "action";

   String SEARCH = "search";

   String RESULT = "result";

   String READONLY = "readonly";

   String ENCODING = "encoding";

   String SELECT = "select";

   String SELECT_TREE = "selectTree";

   String SELECT_TYPE = "selectType";

   String SUCCESS = "success";

   String ERROR = "error";

   String SUBMIT = "submit";

   String WITHDRAW = "withdraw";

   String APPROVAL = "approval";

   String APPROVE = "approve";

   String NOTAPPROVE = "notApprove";

   String RECEIVE = "receive";

   String NOTRECEIVE = "notReceive";

   String DELIVERY = "delivery";

   String PAYBACK = "payBack";

   String NOTDELIVERY = "notDelivery";

   String NOTPAIDBACK = "notPayBack";

   String REJECT = "reject";

   String CANCELAPPR = "cancelAppr";

   String ADJUST = "adjust";

   String REQRESUB = "ReqReSub";

   String STATISTIC = "statistic";

   String TRUE = "1";

   String FALSE = "0";

   String DAY = "Day";
   
   String HOUR = "hour";

   String MONTH = "Month";

   String QUARTER = "Quarter";
   
   String CANCEL = "Cancel";

   String SUSPEND = "Suspend";

   String YEAR = "Year";

   String SPLITTER_PLUS = "+";

   String SPLITTER_DASH = "-";

   String SPLITTER_DASH2 = " - ";

   String SPLITTER_DASH_CN = "\uff0d";

   String SPLITTER_WAVELINE = " ~ ";

   String SPLITTER_BLANK = " ";

   String SPLITTER_BLANK2 = "  ";

   String SPLITTER_BLANK3 = "   ";

   String SPLITTER_BLANK4 = "    ";

   String SPLITTER_ROW = ";";

   String SPLITTER_ROW_SPACE = "; ";

   String SPLITTER_COL = ", ";

   String SPLITTER_COMMA = ",";

   String SPLITTER_AND = "&";

   String SPLITTER_COMMA2 = ", ";

   String SPLITTER_FIELD_VALUE = ":";

   String SPLITTER_FIELD_VALUE2 = ": ";

   String SPLITTER_PLURAL = ".s";

   String SPLITTER_DOT = ".";

   String SPLITTER_NAME = "S,S";

   String PERCENT = "%";

   String LEFT_PARENTTHESES = "(";

   String RIGHT_PARENTTHESES = ")";

   String LEFT = "left";

   String RIGHT = "right";

   String TOP = "top";

   String BOTTOM = "bottom";

   String SELECTED_VALUE = "selectedValue";

   String PERMISSION = "Permission";

   String PERMISSION_READ = "Read";

   String PERMISSION_WRITE = "Write";

   String PERMISSION_READ_WRITE = "ReadWrite";

   String PERMISSION_NONE = "None";

   String PERMISSION_VIEW = "VIEW";

   String PERMISSION_EDIT = "EDIT";

   String UNDERLINE = "_";

   String LAST = "last";

   String FIRST = "first";

   String MIDDLE = "middle";

   String ONLYONE = "onlyOne";

   String ODD = "odd";

   String EVEN = "even";

   String NULL = "null";

   String SUMMARY = "summary";

   String PMONAME = "pmoName";

   String STATUS = "Status";

   String IS_DIALOG = "isDialog";

   String IS_CLOSE = "isClose";

   String KEY_OBJECT = "object";

   String KEY_ERROR_FIELD_NAMES = "errorFieldNames";

   String KEY_ERROR_FIELD_IDS = "errorFieldIds";
   
   String KEY_FETCH_SIZE = "GT.iManage.pageSize";

   String PROJECT_MAX_WAIT = "GT.iManage.project.max.wait";

   String FIELD_NAME_STATUS = "status";

   String FIELD_NAME_DESCRIPTION = "description";

   String FIELD_NAME_TS = "ts";

   String FIELD_NAME_TSUSERID = "tsuserId";

   String FIELD_NAME_ORD = "ord";

   String FIELD_NAME_OBJTYPE = "objType";

   String FIELD_NAME_OBJID = "objId";

   String FIELD_NAME_OWNERTYPE = "ownerType";

   String FIELD_NAME_OWNERID = "ownerId";

   String CURRENT_PAGE_NO = "currentPageNO";

   String SPLIT_PROP_AREA = "->";
   
   String LANGUAGE_EN = "en";
   
   int NUMBER_MAX_FILE_NAME_SIZE = 256;

   int NUMBER_MAX_SIZE = 8;

   int ROLE_EVERYONE = -1;
   
   int ROLE_SUPPLIER_STORE_ADMIN = -13;//店铺管理员
   
   int ROLE_SUPPLIER_STORE_UPDOWN = -14;//店铺商品上下架
   
   int ROLE_SUPPLIER_STORE_INVENTORY = -15;//店铺商品库存更新
   
   int ROLE_SUPPLIER_STORE_DEFAULT = -16;//店铺默认

   int ORDER_STEP = 50;

   int ORDER_START = 100;

   int KB = 1024;

   int MILLION_BYTE = 1024 * 1024;

   int APPROVAL_NAME_MAX_LEN = 64;

   int APPROVAL_DEC_MAX_LEN = 2000;

   int DAY_COUNT_OF_WEEK = 7;

   int HOUR_COUNT_OF_DAY = 24;

   int MAXLEN_STRING1 = 64;

   int MAXLEN_STRING2 = 256;

   int MAXLEN_STRING3 = 2000;

   int MAXLEN_STRING4 = 1073741823;

   int MAXLEN_TYPE = 10;

   int FLOAT_POINT = 15;

   double MAX_FLOAT13 = 100000000000.0;
   
   double MAX_FLOAT15 = 10000000000000.0;

   double MAX_FLOAT16 = 100000000000000.0;

   double MAX_FLOAT18 = 10000000000000000.0;

   Integer SYSTEM_USER_ID = -5;

   Integer CANDIDATE_USER_ID = -20;

   String FLOAT_MAX = "9999999999999999";

   String CAN_WRITE = "can_write";

   String CAN_READ = "can_read";

   // int ROLE_ADMIN = -2;
   // Used for query caching
   String QUERY_OBJ = "queryObj";

   String QUERY_RESULT = "queryResult";

   String GROUP = "Group";

   String PMO = "Pmo";

   String ORGANIZATION = "Organization";

   String USER = "User";

   String TESTCASE = "TestCase";

   String OBJ_TYPE_TESTCASE = "TestCase";

   String OBJ_TYPE_PROJECT_REQUIREMENT = "ProjectRequirement";

   String USER_NAME = "userName";

   String USER_ID = "userId";

   String SALES_RESPS = "salesResps";

   String COMPANY_NAME = "companyName";

   String PURCHASE_COST = "purchaseCost";

   String SALES_CONTRACT = "salesContract";

   String GROSS_PROFIT = "grossprofit";

   String PARTY = "Party";

   String SITE = "Site";

   String COMPANY = "Company";

   String JOB = "Job";

   String FIELD = "Field";

   String COMMENT = "Comment";
   
   String COMMENT_TYPE_RFI_ITEM_SUPP = "RfiItemSupp";
   
   String COMMENT_TYPE_RFI_ITEM_REQ = "RfiItemReq";

   String RISK_COMMENT = "riskComment";

   String KEY_X_AXIS = "xAxis";

   String KEY_Y_AXIS = "yAxis";

   String KEY_Z_AXIS = "zAxis";

   String KEY_X_AXIS_OPTIONS = "xAxisOptions";

   String KEY_Y_AXIS_OPTIONS = "yAxisOptions";

   String KEY_Z_AXIS_OPTIONS = "zAxisOptions";

   String KEY_REPORT_OPTIONS = "reportOptions";

   String KEY_STAT_TABLE = "statTable";

   String NAVIGATION = "navigation";

   String ERROR_MSG = "errorMessage";

   String WARNING_MSG = "warningMessage";

   String KEY_PROTOCAL = "GT.imanage.protocol";

   String KEY_NULL = "";

   String KEY_SERVERADDR = "GT.imanage.serveraddr";

   String KEY_SERVERNAME = "GT.imanage.servername";

   String KEY_SERVERPORT = "GT.imanage.serverport";

   String KEY_SRC_TEMPLATE_ID = "srcTemplateId";

   String KEY_CONTEXTNAME = "GT.imanage.contextname";

   String KEY_OPERATE = "operate";

   String KEY_USERLIST = "userList";

   String KEY_COLOGLIST = "coLogList";

   String KEY_COVIEWLIST = "coViewList";

   String KEY_VIEWLIST = "viewList";

   String KEY_COCHECKINLIST = "coCheckInList";

   String KEY_ACTIVITY_LIST = "activityList";

   String KEY_CO = "co";

   String KEY_CO_FACE = "coFace";

   String KEY_CO_TEMPLATE_LIST = "coTemplateList";

   String KEY_CO_TEMPLATE_OPTIONS = "coTemplateOptions";

   String KEY_CO_TEMPLATE = "coTemplate";

   String KEY_CO_TEMPLATE_ID = "coTemplateId";

   String KEY_CO_FIELD_LIST = "coFieldList";

   String KEY_CO_FIELD = "coField";

   String KEY_CO_FIELD_OPTIONS = "coFieldOptions";

   String KEY_RESOURCES_TYPE_PROP_LIST = "resourcesTypePropList";

   String KEY_RESOURCES_TYPE_PROP = "resourcesTypeProp";

   String KEY_CO_FILTER = "coFilter";

   String KEY_CO_FILTER_LIST = "coFilterList";

   String KEY_PM_FILTER_LIST = "pmFilterList";

   String KEY_CO_FILTER_OPTIONS = "coFilterOptions";

   String KEY_FILTER_OPTIONS = "filterOptions";

   String KEY_COENUM_LIST = "coEnumList";

   String KEY_ATTACHMENT_LIST = "attachmentList";

   String KEY_TEMP_FILES = "tempFiles";

   String KEY_CALENDAR_LIST = "calendarList";

   String KEY_COMMENT_LIST = "commentList";

   String KEY_COMMENT = "comment";

   String KEY_CO_VIEW = "coView";

   String KEY_VIEW = "view";

   String KEY_VIEW_FIELD_LIST = "viewFieldList";

   String KEY_CO_VIEW_LIST = "coViewList";

   String KEY_CO_COUNT_VALUE_MAP = "coCountValueMap";

   String KEY_CO_PRODUCT_LIST = "coProductList";

   String KEY_CO_VERSION_LIST = "coVersionList";

   String KEY_PM_VIEW_LIST = "pmViewList";

   String KEY_VIEW_LIST = "viewList";

   String KEY_CO_VIEW_OPTIONS = "coViewOptions";

   String KEY_VIEW_OPTIONS = "viewOptions";

   String KEY_CO_ACTION = "coAction";

   String KEY_CO_ACTION_LIST = "coActionList";

   String KEY_CO_PROCESS = "coProcess";

   String KEY_CO_TEMP_REQ_FIELD = "coTempReqField";

   String KEY_CO_TEMP_OS_LIST = "coTempOSList";

   String KEY_ACTION_OPTIONS = "actionOptions";

   String KEY_QUERY_REF_OLD = "queryRefOld";

   String KEY_RELATIVE = "relative";

   String KEY_POSITION = "position";

   String KEY_BUDGET_LIST = "budgetList";

   String KEY_BUDGET = "budget";

   String KEY_BUDGET_CLASSIFY = "budgetClassify";

   String KEY_BUDGET_OPTIONS = "budgetOptions";

   String REF_OLD = "refOld";

   String KEY_RELATIONSHIP_LIST = "relationshipList";

   String KEY_RELATIONSHIP = "relationshipInfo";

   String KEY_RELATIONSHIP_OPTIONS = "relationshipOptions";

   String KEY_RELOBJ_LIST = "relObjList";

   String KEY_RELOBJ = "relationObject";

   String KEY_STRUCTRELOBJ_DEPENDON = "allDependOnObjects";

   String KEY_STRUCTRELOBJ_REVISED = "allRevisedObjects";

   String KEY_RELOBJ_DUPLICATION = "allDuplicationObjects";

   String KEY_OBJECTTYPES = "allObjectTypes";

   String KEY_PROJECT = "projectInfo";

   String KEY_PROJECT_LIST = "projectList";

   String KEY_DOCTYPE = "docTypeInfo";

   String KEY_DOCTYPE_LIST = "docTypeList";

   String KEY_DOCTYPE_OPTIONS = "docTypeOptions";

   String KEY_DOCUMENT_LIST = "documentList";

   String KEY_DOCUMENT = "documentInfo";

   String KEY_DOCUMENT_VERSION = "documentVersion";

   String KEY_DOCUMENT_VERSIONS = "documentVersions";

   String KEY_TREE_OPENLEVEL = "GT.iManage.tree.default.level";

   String KEY_APPROVAL_LIST = "approvalList";

   String KEY_APPROVAL_UNDERLYING = "approvalUnderlying";

   String KEY_DEFAULT_APPROVER = "defaultApproverGroupSelect";

   String KEY_APPROVAL_LV1_LIST = "approvalLv1List";

   String KEY_APPROVAL_OTHER_LIST = "approvalOtherList";

   String KEY_APPROVAL_HISTORY_LIST = "approvalHistList";

   String KEY_APPROVAL = "approvalInfo";

   String KEY_APPROVALSTEPS_LIST = "approvalSteps";

   String KEY_APPROVALSTEPUSERS_LIST = "approvalStepUsers";

   String KEY_APPROVALSTEPSFORM = "approvalStepsFormInfo";

   String KEY_COLISTSHOWTIPS = "CoListShowTips";

   String KEY_APPROVALEVENT_LIST = "approvalEventList";

   String PROJECTAPPROVALLIST = "projectApprovalList";

   String ACTIVITYAPPROVALLIST = "activityApprovalList";

   String STRATEGYAPPROVALLIST = "strategyApprovalList";

   String APPROVAL_1ST_LIST = "approval1stList";

   String APPROVAL_HIST_LIST = "approvalHistList";

   String APPROVALEDIT = "approvalEdit";

   String APPROVALEDITHOME = "approvalEditHome";

   String APPROVALEVENT = "eventList";

   String APPROVALEVENTHOME = "eventListHome";

   String KEY_PRODUCT_OPTIONS = "productOptions";

   String KEY_REPORT_FONTNAME = "GT.report.fontName";

   String KEY_REPORT_FONTSIZE = "GT.report.fontSize";

   String KEY_REPORT_PDFFONTNAME = "GT.report.pdfFontName";

   String KEY_REPORT_PDFENCODING = "GT.report.pdfEncoding";

   String KEY_REPORT_PDFEMBEDDED = "GT.report.pdfEmbedded";

   String KEY_REPORT_CHARACTERWIDTH = "GT.report.characterWidth";

   String KEY_APPROVAL_ERROR_INVALID_UNDERLYING_STATUS = "error.approval.invalidUnderlyingStatus";

   String KEY_APPROVAL_ERROR_HASSUBMIT = "error.approval.hasSubmit";

   String KEY_APPROVAL_ERROR_NONEED_SUBMIT = "error.approval.noNeedToSubmit";

   String KEY_APPROVAL_ERROR_INVALID_COST_APPROVER = "error.approval.invalidCostApprovers";

   String KEY_APPROVAL_ERROR_HASSUBMIT_ACT = "error.approval.hasSubmitAct";

   String KEY_APPROVAL_ERROR_PARENTNOTINLIST = "error.approval.parentNotInList";

   String KEY_APPROVAL_ERROR_OPRUSER_NOTINLIST = "error.approval.oprUserNotInList";

   String KEY_APPROVAL_ERROR_ACTOPRUSER_NOTINLIST = "error.approval.oprUserNotInActList";

   String KEY_APPROVAL_ERROR_APPROVER_NOTALLOWED = "error.approval.approverIsNotAllowed";

   String KEY_APPROVAL_ERROR_INVALIDAPPR_SUBMIT = "error.approval.invalidApproverOnSubmit";

   String KEY_APPROVAL_ERROR_INVALIDAPPR_FLOW = "error.approval.invalidApproverInFlow";

   String KEY_APPROVAL_ERROR_NOBASELINE = "error.approval.noBaseline";

   String KEY_APPROVAL_ERROR_INVALIDSTATE_INJOB_FORCANCEL = "error.approval.invalidStateInJobForCancel";

   String KEY_APPROVAL_ERROR_INVALIDSTATUS = "error.approval.invalidStatus";

   String KEY_APPROVAL_ERROR_INVALIDSTATUS_ACTION = "error.approval.invalidStatusAction";

   String KEY_APPROVAL_ERROR_INVALIDSTATUS_LIST = "error.approval.invalidStatusAction.list";

   String KEY_APPROVAL_ERROR_INVALIDSTATUS_LIST2 = "error.approval.invalidStatusAction.list2";

   String KEY_APPROVAL_ERROR_REQ_SUFFIX = "error.approval.request";

   String KEY_APPROVAL_ERROR_HASNOSTEP = "name.approval.hasNoStep2";

   String KEY_APPROVAL_ERROR_PROJ_HASNOSTEP = "name.approval.proj.hasNoStep2";

   String KEY_APPROVAL_ERROR_ACT_HASNOSTEP = "name.approval.act.hasNoStep2";

   String KEY_APPROVAL_ERROR_NOTALLOW_RESUBMIT = "error.approval.notAllowResumit";

   String KEY_APPROVAL_ERROR_INVALID_PRED = "error.approval.approvalStep.invalidPredecessor";

   String KEY_APPROVAL_ERROR_INVALID_RESUBMIT = "error.approval.invalidResubmit";

   String KEY_APPROVAL_ERROR_INVALID_END = "error.approval.invalidEnd";

   String KEY_APPROVAL_ERROR_INVALIDUSER_END_ACT = "error.approval.invalidUserToEndAct";

   String KEY_APPROVAL_ERROR_INVALIDUSER_END_PROJ = "error.approval.invalidUserToEndProj";

   String KEY_APPROVAL_ERROR_DUPLICATE_APPROVER = "error.approval.duplicateApproverInSteps";

   String KEY_APPROVAL_ERROR_INVALID_JOBSTATUS = "error.approval.invalidJobStatus";

   String KEY_COMMITMENT_ERROR_INVALIDSTATUS = "error.commitment.invalidStatus";

   String KEY_COMMITMENT_ERROR_ALREADY_RESPONSE = "error.commitment.alreadyResponse";

   String KEY_COMMITMENT_ERROR_MISSING_APPROVER = "error.commitment.missingInput.approver";

   String KEY_COMMITMENT_ERROR_INVALIDAPPROVER = "error.commitment.invalidApprover";

   String KEY_COMMITMENT_ERROR_INVALIDAPPROVER2 = "error.commitment.invalidApprover.notFound";

   String KEY_COMMITMENT_ERROR_INVALIDJOBSTATUS = "error.commitment.invalidJobStatus";

   String KEY_COMMITMENT_ERROR_INVALIDJOBSTATUS_MULTILEG = "error.commitment.invalidJobStatus.multiLeg";

   String KEY_COMMITMENT_ERROR_INVALID_RESALC_STATUS = "error.commitment.resourceAllocate.notApproved";

   String KEY_COMMITMENT_ERROR_INVALID_RESALC_STATUS2 = "error.commitment.resourceAllocate.notApproved.noTR";

   String KEY_COMMITMENT_ERROR_ALREADY_COMPLETE = "error.commitment.alreadyComplete";

   String KEY_COMMITMENT_ERROR_DUPLICATED_ITEMS = "error.commitment.duplicatedItems";

   String KEY_COMMITMENT_ERROR_JOB_HAS_CANCEL_APPROVAL = "error.commitment.jobHasCancelApproval";

   String KEY_COMMITMENT_ERROR_ALREADY_COMMITTED = "error.commitment.jobAlreadyCommitted";

   String KEY_COMMITMENT_ERROR_ALREADY_COMMITTED_ITEM = "error.commitment.itemAlreadyCommitted";

   String KEY_COMMITMENT_ERROR_ALREADY_COMMITTED_DEP = "error.commitment.depAlreadyCommitted";

   String KEY_COMMITMENT_ERROR_ALREADY_COMMITTED_REQ = "error.commitment.reqAlreadyCommitted";

   String KEY_COMMITMENT_ERROR_ALREADY_COMMITTED_RESALC = "error.commitment.resAlcAlreadyCommitted";

   String KEY_COMMITMENT_ERROR_ALREADY_COMMITTED_CR = "error.commitment.coAlreadyCommitted";

   String KEY_COMMITMENT_ERROR_JOB_COMMITTEDBY = "error.commitment.invalidJobCommittedBy";

   String KEY_COMMITMENT_ERROR_JOB_COMMITTEDTO = "error.commitment.invalidJobCommittedTo";

   String KEY_COMMITMENT_ERROR_NOCOMMITTEDTO_AVAIL = "error.commitment.noCommittedToAvail";

   String KEY_COMMITMENT_ERROR_COMMITTEDTO = "error.commitment.invalidCommittedTo.notFound";

   String KEY_COMMITMENT_ERROR_NOAPPROVER_AVAIL = "error.commitment.noApproverAvail";

   String KEY_COMMITMENT_ERROR_NOVERSION = "error.commitment.noItemVersion";

   String KEY_COMMITMENT_ERROR_CANNOT_CANCEL = "error.commitment.cannotCancelCommitment";

   String KEY_COMMITMENT_ERROR_NO_DELIVERABLES = "error.commitment.noDeliverables";

   String KEY_COMMITMENT_ERROR_NO_DETAIL = "error.commitment.noDetails";

   String KEY_COMMITMENT_INVALID_LEG = "error.commitment.invalidLegUpdate";

   String KEY_COMMITMENT_ERROR_ALREADY_COMPLETE_PROJECT = "commitment.errorMsg.project.alreadyComplete.new";

   String KEY_COMMITMENT_ERROR_ALREADY_COMPLETE_ACTIVITY = "commitment.errorMsg.activity.alreadyComplete.new";

   String KEY_COMMITMENT_ERROR_ALREADY_COMPLETE_DELIVERABLE = "commitment.errorMsg.deliverable.alreadyComplete.new";

   String KEY_COMMITMENT_ERROR_ALREADY_COMPLETE_RESOURCE = "commitment.errorMsg.resouce.alreadyComplete.new";

   String KEY_COMMITMENT_ERROR_ALREADY_COMPLETE_DEPENDENCY = "commitment.errorMsg.dependency.alreadyComplete.new";

   String KEY_COMMITMENT_ERROR_ALREADY_COMPLETE_CR = "commitment.errorMsg.cr.alreadyComplete.new";

   String KEY_COMMITMENT_ERROR_CANNOT_AGREEREJECT = "commitment.errorMsg.agreeReject.statusChanged";

   String KEY_APPROVAL_ERROR_HAS_INPROGRESS_COMM = "error.approval.hasInProgressCommitment";

   String KEY_APPROVAL_ERROR_NOTALLOW_PROJ_MANAGER_ONLY = "error.approval.notAllowProjManagerOnly";

   String KEY_APPROVAL_ERROR_NOTALLOW_PROJ_STATUS_MANAGER_ONLY = "error.approval.notAllowProjStatusManagerOnly";

   String KEY_APPOVAL_ERROR_ONLY_PRO_DEL_ALLOW_APPR = "error.approval.onlyProWithDelAllowAppr";

   String KEY_COMMITMENT_NO_LEG = "error.commitment.noCommitmentItemsFound";

   String KEY_COMMITMENT_INVALID_LEG_FOR_PROPOSE = "error.commitment.invalidLegForPropose";

   String KEY_COMMITMENT_HAS_DELETED_USER = "error.commitment.hasDeletedUser";

   String KEY_COMMITMENT_SAME_PROPOSED = "error.commitment.sameCommitmentProposed";

   String KEY_COMMITMENT_INTERNAL_IN_DIFFERENT_PROJ = "error.commitment.hasInternalObjectInDifferentProject";

   String KEY_APPROVAL_ERROR_BUDGETS = "error.approval.budget.noBudget";

   String KEY_APPROVAL_ERROR_APPROVERNOTINLIST = "error.approval.approverNotInList";

   String KEY_APPROVAL_ERROR_PROJECT_NOAPPROVER = "error.approval.project.noProjectApprover";

   String KEY_APPROVAL_ERROR_ACT_APPROVERNOTINLIST = "error.approval.activityApproverNotInList";

   String KEY_APPROVAL_ERROR_APPROVERNOTINLIST2 = "error.approval.approverNotInList2";

   String KEY_APPROVAL_ERROR_ACT_APPROVERNOTINLIST2 = "error.approval.activityApproverNotInList2";

   String KEY_APPROVAL_ERROR_ALREADYCANCELLED = "error.approval.alreadyCancelled";

   String KEY_APPROVAL_ERROR_ALREADYAPPROVED = "error.approval.alreadyApproved";

   String KEY_APPROVAL_ERROR_NOTYET_STARTED = "error.approval.notYetStarted";

   String KEY_APPROVAL_ERROR_INVALIDSTEP = "error.approval.invalidStep";

   String KEY_APPROVAL_ERROR_INVALIDUSER = "error.approval.invalidUser";

   String KEY_APPROVAL_ERROR_INVALID_STEPSTATUS = "error.approval.invalidStepStatus";

   String KEY_APPROVAL_ERROR_NO_SAME_APPROVE_ACTION = "error.approval.noSameApproveAction";

   String KEY_APPROVAL_ERROR_NO_SAME_REJECT_ACTION = "error.approval.noSameRejectAction";

   String KEY_APPROVAL_ERROR_REJECTED_IN_PRED = "error.approval.rejectedInPredecessors";

   String KEY_APPROVAL_ERROR_WITHDRAW_ERROR = "error.approval.withdraw.error";

   String KEY_NOROLES = "error.approval.noroles";

   String KEY_UNDERLIER_NOLONGER_REQUIRED = "error.commitment.underlier.noLongerRequired";

   String KEY_UNDERLIER_NOLONGER_REQUIRED2 = "error.commitment.underlier.noLongerRequired.noTR";

   String KEY_UNDERLIER_CLOSED = "error.commitment.underlier.closed";

   String COMMON_MESSAGE_FORWARD = "/common/message.jsp";

   String KEY_IMAGE_PATH = "GT.image.path";

   // Appended by ConnorLv 2004-10-18
   String COTEMPFIELD_GET_BASICFIELD_LIST = "CoTempField_getBasicFieldList";

   String COTEMPFIELD_GET_OPTIONALFIELD_LIST = "CoTempField_getOptionalFieldList";

   // Appended by ConnorLv 2004-10-18
   String KEY_TOTAL_COUNT = "totalCount";

   String KEY_NUM_IN_A_PAGE = "recondsNumInaPage";

   String KEY_LANGUAGE = "language";

   String KEY_CONFIG_ENCODING_CLIENT = "encoding.client";

   String KEY_CONFIG_ENCODING_SERVER = "encoding.server";

   String KEY_CONFIG_ENCODING_DB = "encoding.db";

   String KEY_SESSION_USER = "user";

   String KEY_ID_STARTUP = "GT.framework.idCounter.startup";
   
   String KEY_IDNUMBER_ID_STARTUP = "GT.framework.idNumber.idCounter.startup";

   String KEY_ID_STEP = "GT.framework.idCounter.step";

   String KEY_COMPANYLIST = "companyList";

   String ATTR_OBJECTLIST = "attrObjectList";

   String KEY_GROUPLIST = "userGroupList";

   String KEY_ROLELIST = "roleList";

   String KEY_HERIT_ROLELIST = "heritRoleList";

   String KEY_DEST_LIST = "destList";

   String KEY_SRC_LIST = "srcList";

   String KEY_NAVIGATION_LIST = "navigationList";

   String KEY_DATE_FORMAT = "global.date.format";

   String KEY_DATE_FORMAT_TS = "global.date.format.ts";

   String KEY_DATE_SIMPLEFORMAT = "global.date.simpleFormat";

   String KEY_DATE_PARSE = "global.date.parse";

   String KEY_SESSION_LOSTTIME = "GT.framework.session.maxInactiveInterval";

   String KEY_MONEY_FORMAT = "global.money.format";

   String KEY_AMOUNT_FORMAT = "global.amount.format";

   String KEY_PERCENT_FORMAT = "global.percent.format";

   String KEY_SERVER_PROTOCAL = "GT.iManage.protocol";

   String KEY_SERVER_NAME = "GT.iManage.serverName";

   String KEY_SERVER_ADDRESS = "GT.iManage.serverAddress";

   String KEY_SERVER_PORT = "GT.iManage.serverPort";

   String KEY_JMXSERVICE_PORT = "GT.iManage.jmxServicePort";

   String KEY_SERVER_CONTEXTNAME = "GT.iManage.contextName";

   String KEY_MAIL_RETURNADDR = "global.mail.returnAddr";

   String KEY_MAIL_MAILSERVER = "global.mail.mailServer";

   String KEY_MAIL_LOGIN = "global.mail.login";

   String KEY_MAIL_LOGIN_AUTTHENTICATE = "global.mail.login.authenticate";

   String KEY_MAIL_USER = "global.mail.login.user";

   String KEY_MAIL_PASSWORD = "global.mail.login.password";

   String KEY_MAIL_PORT = "global.mail.port";

   String KEY_MAIL_USESSL = "global.mail.useSSL";

   String KEY_MAIL_MAXRECIPIENT = "global.mail.maxRecipients";

   String KEY_MAIL_SEND_CORETHREAD = "global.mail.send.coreThread";

   String KEY_MAIL_SEND_MAXTHREAD = "global.mail.send.maxThread";

   String KEY_MAIL_QUEUE_THRESHOLD = "global.mail.send.queueThreshold";

   String KEY_QUEUE_MAXSIZE = "global.queue.maxSize";

   String KEY_SCHEDULER_POOLSIZE = "global.scheduler.poolsize";

   String ROLEMEMBER_GET_BY_ID = "Rolemember_getById";

   String USER_GET_ALL_ROLES = "User_getAllUserRoles";

   String USER_GET_ROLES = "User_getUserRoles";

   String ROLEMEMBER_GET_BY_MEMBERID = "Rolemember_getRolemembersByMemberId";

   String ROLEMEMBER_GET_PRIVATEROLE = "Rolemember_getPrivateRole";

   String ROLE_GETALL_ACTIVEROLES = "Role_getAllActiveRoles";

   String ROLE_GET_BY_MEMBERID = "Role_getRolesByMemberId";

   String ROLE_GET_BY_MEMBERID2 = "Role_getRolesByMemberId2";

   String ROLE_GET_BY_PK = "Rolemember_getRolemembersByPK";

   String JOBFIELD_GET_ALL = "JobField_getAll";

   String JOBFIELD_GET_BY_FIELDNAME = "JobField_getByFieldName";

   String FUNC_GETALL = "Func_getAll";

   String FUNC_GETHIDDEN = "Func_getHidden";

   // String ROLE_GET_BY_MEMBERID = "Role_getRolesByMemberId";
   String USER_GETBY_USERNAME = "User_getByUserName";

   String USER_GETBY_USERID = "User_getByUserId";

   String USER_COUNT_USER = "User_countUser";

   String USER_GET_ACTIVEUSER = "User_getActiveUser";

   String USER_GETALL_ACTIVEUSER = "User_getAllActiveUser";

   String USER_GETALL_USER = "User_getAllUser";

   String USERREPORT_GETBY_USERIDTYPE = "UserReport_getByUserIdType";

   String USERREPORT_GETBY_USERIDSTYPE = "UserReport_getByUserIdsType";

   String ATTACHMENT_GETBY_OWNER = "Attachment_getByOwner";

   String ATTACHMENT_GETBY_PK = "Attachment_getByPk";

   String FILEDELETED_GET_ALL = "FileDeleted_getAll";

   String CHAT_GETBY_OWNER = "Chat_getByOwner";

   String CHAT_GETBY_CHATNAME = "Chat_getByChatName";

   String CHAT_GETBY_CHATNAME2 = "Chat_getByChatName2";

   String CHAT_GETBY_PROJECTID = "Chat_getByProjectId";

   String CHAT_GETBY_JOBID = "Chat_getByJobId";

   String CHAT_GET_LATEST_CHAT_BY_USERID = "Chat_getLatestChatByUserId";

   String CHATMEMBER_GETBY_CHATID = "ChatMember_getByChatId";

   String CHATMEMBER_GET_LATEST_CHAT_BY_USERID = "ChatMember_getLatestChatByUserId";

   String COMMENT_GETBY_OWNER = "Comment_getByOwner";

   String COTEMPLATE_GETBY_PK = "CoTemplate_getByPk";

   String COTEMPLATE_GETBY_TEMPLATENAME = "CoTemplate_getByTemplateName";

   String COTEMPLATE_GETBY_TEMPLATENAME2 = "CoTemplate_getByTemplateName2";

   String COTEMPLATE_GET_ALL = "CoTemplate_getAll";

   String COTEMPLATE_EXISTS_TEMPLATE = "CoTemplate_existsTemplate";

   String COTEMPFIELD_GETBY_TEMPLATEID = "CoTempField_getByTemplateId";

   String COTEMPFIELD_GETBY_TEMPLATEID2 = "CoTempField_getByTemplateId2";

   String COTEMPFIELD_GETBY_PK = "CoTempField_getByPk";

   String COTEMPFIELD_GET_FIELD_LIST = "CoTempField_getFieldList";

   String COTEMPFIELDDEP_GETBY_TEMPLATEID = "CoTempFieldDep_getByTemplateId";

   String COTEMPFIELDROLE_GETBY_TEMPLATEID = "CoTempFieldRole_getByTemplateId";

   String COTEMPFIELDDEP_GETBY_TEMPFIELD = "CoTempFieldDep_getByTempField";

   String COTEMPFIELDDEP_GETBY_ENUMID = "CoTempFieldDep_getByEnumId";

   String COTEMPFIELDDEP_GET_DEPENDED_FIELD = "CoTempFieldDep_getDependedField";

   String COTEMPACTION_GET_ROLE_LIST = "CoTempAction_getRoleList";

   String COTEMPACTION_GETBY_TEMPLATEID = "CoTempAction_getByTemplateId";

   String COTEMPOS_GETBY_TEMPLATEID = "CoTempOS_getByTemplateId";

   String COPROCESS_GETBY_TEMPLATEID = "CoProcess_getByTemplateId";

   String COPROCESS_GETBY_STATUSID = "CoProcess_getByStatusId";

   String COTEMPREQFIELD_GETBY_TEMPLATEID = "CoTempReqField_getByTemplateId";

   String COTEMPREQFIELD_GETBY_STATUSID = "CoTempReqField_getByStatusId";

   String COTEMPREQFIELD_GETBY_FIELDID = "CoTempReqField_getByFieldId";

   String COFIELD_EXISTS_FIELD = "CoField_existsField";

   // String COFIELD_GETBY_FIELDNAME2 = "CoField_getByFieldName2";
   // String COFIELD_GETBY_PK = "CoField_getByPk";
   String COFIELD_GET_ALL = "CoField_getAll";

   String COFIELD_GET_USER_FIELD = "CoField_getUserField";

   String COFIELD_GET_SYSTEM_FIELD = "CoField_getSystemField";

   // String COFIELD_GETBY_ENUMTYPE = "CoField_getByEnumType";
   String COFIELD_GETBY_FIELDTYPE = "CoField_getByFieldType";

   String COFIELD_GETBY_LUC = "CoField_getByLUC";

   String COFIELD_GETBY_USERCOMPANYTYPE = "CoField_getByUserCompanyType";

   // String COFIELD_GET_NOTIN_TEMLATE_FIELD = "CoField_getNotInTemplateField";
   String COENUM_GETBY_FIELDID = "Enum_getByFieldId";

   String COENUM_GETBY_PK = "Enum_getByPk";

   String COREPORT_GETBY_USERID = "Report_getByUserId";

   String COREPORT_GETBY_REPROTNAME = "CoReport_getByReportName";

   String COREPORT_GETBY_REPROTNAME2 = "CoReport_getByReportName2";

   String COREPORT_GETBY_FILTERID = "CoReport_getByFilterId";

   String COACTION_GET_ALL = "CoAction_getAll";

   String COACTION_GETBY_ACTIONID = "CoAction_getByActionId";

   String COACTION_GETBY_ACTIONNAME = "CoAction_getByActionName";

   String COACTION_GETBY_ACTIONNAME2 = "CoAction_getByActionName2";

   String CO_GETBY_PK = "Co_getByPk";

   String CO_GET_ALL = "Co_getAll";

   String CO_GET_ALL2 = "Co_getAll2";

   String CO_GET_CHECKIN = "Co_getCheckIn";

   String CO_GET_CHECKIN2 = "Co_getCheckIn2";

   String CO_GET_ACTIVITY = "Co_getActivity";

   String CO_GET_PRODUCT_STAT = "Co_getProductStat";

   String CO_UPDATE_ON = "Co_updateOn";

   String CO_IFCANDELETE = "Co_ifCanDelete";

   String COJOB_GET_COUNT_BY_CO = "CoJob_getCountByCo";

   String COQUEUE_GETBY_PRODUCTID_USERID = "CoQueue_getByProductIdUserId";

   String COQUEUE_GETBY_PRODUCTID_USERID2 = "CoQueue_getByProductIdUserId2";

   String COQUEUE_CAN_BE_USED = "CoQueue_canBeUsed";

   String COQUEUE_GET_QUEUEUSER_BY_QUEUEID_USERID = "CoQueue_getQueueUserByQueueIdUserId";

   String COQUEUEUSER_GETBY_QUEUEID = "CoQueueUser_getByQueueId";

   String COQUEUEMEMBER_GETBY_ID = "CoQueueMember_getById";

   String COQUEUECO_GETBY_QUEUEID = "CoQueueCo_getByQueueId";

   String COQUEUECO_CANBEORDER_BY_QUEUEID = "CoQueueCo_canBeOrderByQueueId";

   String COQUEUECO_GETCOBY_QUEUEID = "CoQueueCo_getCoByQueueId";

   String COQUEUECO_GETBY_QUEUEID_BY_ORD = "CoQueueCo_getByQueueIdByOrd";

   String COQUEUECO_GETBY_COID = "CoQueueCo_getByCoId";

   String COQUEUECO_GET_MAXORD = "CoQueueCo_getMaxOrd";

   String COQUEUECO_GET_CO_POSITION = "CoQueueCo_getCoPosition";

   String COQUEUECO_GET_QUEUE_LENGHT = "CoQueueCo_getQueueLength";

   String COQUEUECO_GET_PREVIOUS = "CoQueueCo_getPrevious";

   String COQUEUECO_GET_NEXT = "CoQueueCo_getNext";

   String COQUEUE_GETBY_COID = "CoQueue_getByCoId";

   String COQUEUE_GET_ALL = "CoQueue_getAll";

   String COQUEUE_GETBY_USERID = "CoQueue_getByUserId";

   String COQUEUE_GETBY_PRODUCTID = "CoQueue_getByProductId";

   String COQUEUE_GET_COUNT_BY_PRODUCTID = "CoQueue_getCountByProductId";

   String COQUEUE_GETBY_PRODUCTID_AND_USERID = "CoQueue_getByProductIdAndUserId";

   String COQUEUE_GETBY_ID = "CoQueue_getById";

   String COQUEUETEMPLATE_GETBY_COQUEUEID = "CoQueueTemplate_getByCoQueueId";

   String COEXTEND_GETBY_PK = "CoExtend_getByPk";

   String COEXTEND_GETBY_COID = "CoExtend_getByCoId";

   String COEXTEND_GETBY_PRODUCTID = "CoExtend_getByProductId";

   String COEXTEND_GETDUPLICATEBY_VALUEID = "CoExtend_getDuplicateSource";

   String COLOG_GETBY_COID = "CoLog_getByCoId";

   String COLOG_GETBY_TS = "CoLog_getByTS";

   String COLOG_LOGAFTER = "CoLog_logAfter";

   String COVIEW_GETBY_OWNERID = "CoView_getByOwnerId";

   String COVIEW_GETBY_VIEWNAME = "CoView_getByViewName";

   String COAPPROVER_GETBY_PRODUCTID = "CoApprover_getByProductId";

   String COVIEWFIELD_GETBY_VIEWID = "CoViewField_getByViewId";

   String VIEW_GETBY_OWNERIDTYPE = "View_getByOwnerIdType";

   String VIEWFIELD_GETBY_OWNERIDTYPE = "ViewField_getByOwnerIdType";

   String OBJ_TYPE_PMO = "PMO";
   
   String OBJ_TYPE_SHOP = "Shop";

   String OBJ_TYPE_FUNNEL = "Funnel";

   String OBJ_TYPE_AREA = "Area";

   String OBJ_TYPE_PMOGOAL = "PMOGoal";

   String OBJ_TYPE_BILLMATERIAL = "BillMater";
   
   String OBJ_TYPE_BILLMATERIAL_ITEM = "BillMaterItem";
   
   String OBJ_TYPE_BILLMATERIAL_ICON = "BillMaterIcon";

   String OBJ_TYPE_PMO2 = "Pmo";

   String OBJ_TYPE_PORTFOLIO = "PORTFOLIO";

   String OBJ_TYPE_RESOURCESALLOCATE = "ResAlc";

   String OBJ_TYPE_RESOURCEPLOTTER = "ResPlotter";

   String OBJ_TYPE_RESPLOTTERSKILL = "ResPlotterSkill";
   
   String OBJ_TYPE_RESPLOTTERPROVISION = "ResPloProv";

   String OBJ_TYPE_SURVEY = "Survey";
   
   String OBJ_TYPE_SURVEY_ICON = "SurveyIcon";
   
   String OBJ_TYPE_STRATEGY = "Strategy";

   String OBJ_TYPE_STRATEGY_INFLUENCER = "StrategyInfluencer";
   
   String OBJ_TYPE_COMPETITION_COMPETITOR = "CompetitionCompetitor";

   String OBJ_TYPE_CLIENT_STRATEGY = "ClientST"; //Client Strategy
   
   String OBJ_TYPE_SUPPLIER_STRATEGY = "SupplierST"; //Supplier Strategy
   
   String OBJ_TYPE_STRATEGY_REVENUE = "StrategyRevenue";

   String OBJ_TYPE_STRATEGY_GOAL = "StrategyGoal";

   String OBJ_TYPE_DEAL = "Deal";

   String OBJ_TYPE_CLIENT_DEAL = "ClientDeal"; //Client Deal
   
   String OBJ_TYPE_SUPPLIER_DEAL = "SuppDeal"; //Supplier Deal

   String OBJ_TYPE_DEALQUOTATION = "DealQuo";

   String OBJ_TYPE_CAMPAIGN = "Campaign";

   String OBJ_TYPE_STRATEGY_ADJUSTMENT_CHANGEORDER = "StrAdjmtCo";

   String FLOW_OBJ_TYPE_CAMPAIGN_CONTENT = "CampgnCont";

   String FLOW_OBJ_TYPE_CAMPAIGN_CONTENT2 = "Content";

   String OBJ_TYPE_RESP_TENDER = "RespTender";

   String OBJ_TYPE_MEASUREMENT = "Measurement";
   
   String OBJ_TYPE_RE_SUBMIT_PRICE = "ReSubPrice";

   String OBJ_TYPE_EXPENSE = "Expense";
   
   String OBJ_TYPE_PROJECTWORKwEEKLY = "ProjectWorkWeekly";//当虹项目周报

   String OBJ_TYPE_EXPENSE_ITEM = "ExpenseItem";

   String OBJ_TYPE_EXPENSE_ADVANCE = "ExpAdvance";

   String OBJ_TYPE_EXPENSE_REPORT = "ExpReport";

   String OBJ_TYPE_EXPENSE_TVISA = "TVisa";
   
   String OBJ_TYPE_EXPENSE_CATEGORY = "ExpenseCategory";
   
   String OBJ_TYPE_QUOTATION_INTERACTION = "QuotationInteraction";

   String OBJ_TYPE_QUOTATION = "Quotation";
   
   String OBJ_TYPE_QUOTATION_VERSION = "QuoVersion";
   
   String OBJ_TYPE_QUOTATION_FS = "QuotationFs";   

   String OBJ_TYPE_PURCHASEORDER = "PurOrder";
   
   String OBJ_TYPE_PRODUCT_RECEIVE_FROM_INVENTORY_FOR_PRODUCT_INVENTORY = "ProRecFromInv";
   
   String OBJ_TYPE_PRODUCT_RECEIVE_FROM_PRODUCT_MOVE_FOR_PRODUCT_INVENTORY = "ProRecFromMove";
   
   String OBJ_TYPE_REALITYCHECK = "Realitycheck";
   
   String OBJ_TYPE_PURCHASEORDER_DELIVERY = "PurOrderDelivery";
   
   String OBJ_TYPE_PURCHASEORDER_SUPPLIER_CONFIRM = "PurOrderSuppConfir";

   String OBJ_TYPE_ORDER = "Order";

   String OBJ_TYPE_RETURN = "Return";
   
   String OBJ_TYPE_REPAIR = "Repair";

   String OBJ_TYPE_QUOTATIONRECEIVED = "QReceived";
   
   String OBJ_TYPE_DEALRETURN = "DReturn";

   String OBJ_TYPE_QUOTATIONRETURN = "QReturn";
   
   String OBJ_TYPE_QUOTATIONREPAIR = "QRepair";
   
   String OBJ_TYPE_MATERIAL = "Material";
   
   String OBJ_TYPE_EQUIPMENT = "Equipment";

   String OBJ_TYPE_HEADCOUNT = "Headcount";

   String OBJ_TYPE_ISSUE = "Issue";

   String OBJ_TYPE_CONTRIBUTION = "Contribution";

   String OBJ_TYPE_ASSIGNMENT = "Assignment";
   
   String OBJ_TYPE_ASSIGNMENT_PATH = "AssignPath";
   
   String OBJ_TYPE_STOCHCHECK = "StockCheck";

   String OBJ_TYPE_CIRCUIT = "Circuit";

   String OBJ_TYPE_ENDPOINT = "EndPoint";

   String OBJ_TYPE_DEFERRAL = "Deferral";

   String OBJ_TYPE_LEAVETYPEVERSIONS = "LeaveTypeVersions";

   String OBJ_TYPE_ISSUEACTION = "Issueaction";

   String OBJ_TYPE_ASSIGNMENTACTION = "Assignmentaction";

   String OBJ_TYPE_INTERACTIONACTION = "Interactionaction";

   String OBJ_TYPE_ISSUE_ACTION = "IssueAction";

   String OBJ_TYPE_ISSUEANDACTION = "IssueAndAction";

   String OBJ_TYPE_RESPUSER = "RespUser";

   String OBJ_TYPE_RESPPARTY = "RespParty";

   String OBJ_TYPE_KEYRES = "KeyRes";

   String OBJ_TYPE_BUDGETJOB = "BudgetJob";

   String OBJ_TYPE_BUDGETCLS = "BudgetCls";
   
   String OBJ_TYPE_PORCV = "PORcv";

   String OBJ_TYPE_PRODVER = "ProductVer";

   String OBJ_TYPE_ITEM_CHECK = "ItemCheck";

   String OBJ_TYPE_ITEM_ACCEPT = "ItemAccept";

   String OBJ_TYPE_ITEM_CHECK_APP = "CheckApp";

   String OBJ_TYPE_ITEM_ACCEPT_APP = "AcceptApp";

   String OBJ_TYPE_INVOICE = "Invoice";

   String OBJ_TYPE_INVOICEFROM = "InvoiceFrom";
   
   String OBJ_TYPE_PO_INVOICE = "PoInvoice";

   String OBJ_TYPE_PAYMENT = "Payment";

   String OBJ_TYPE_PAYMENTTO = "PaymentTo";

   String OBJ_TYPE_COMMISSION = "Commission";

   String OBJ_TYPE_REVENUE = "Revenue";

   String OBJ_TYPE_TENDER = "Tender";

   String OBJ_TYPE_TENDERSELECTION = "TenderSel";
   
   String GROUP_TYPE_TENDER_FINAL_SELECTION = "TenderFinalSelection";
   
   String OBJ_TYPE_TENDER_OPEN = "TenderOpen";
   
   String OBJ_TYPE_TENDER_SHOW_BTN = "RfiIssueBtn";
   
   String OBJ_TYPE_TENDER_RFIPARTISI = "RfiPartisi";

   String OBJ_TYPE_DISCOVERY = "DLink";

   String OBJ_TYPE_QUOTATION_RETURN_ITEM = "QReturnItem";

   String OBJ_TYPE_QUOTATION_SHIPMENT = "QShipment";

   String OBJ_TYPE_QUOTATION_SHIPMENT_ITEM = "QShipItem";

   String OBJ_TYPE_QUOTATION_NOTE = "QNote";

   String OBJ_TYPE_ASSET = "Asset";

   String OBJ_TYPE_OTHERASSET = "OtherAsset";
   String OBJ_TYPE_FIXEDASSET= "FixedAsset";
   String OBJ_TYPE_INTANGIBLEASSET = "IntangibleAsset";
   String OBJ_TYPE_INVESTMENT = "Investment";
   String OBJ_TYPE_CASHACCOUNT = "CashAccount";
   String OBJ_TYPE_LENDING = "Lending";
   String OBJ_TYPE_LIABILITY = "Liability";
   String OBJ_TYPE_OWNERSEQUITY = "OwnersEquity";
  
   
   String OBJ_TYPE_CONTENT = "Content";

   String OBJ_TYPE_BOM_UNLOCK_REQ = "BomUnlockRq";

   String OBJ_TYPE_PHYSICAL = "Physical";

   String OBJ_TYPE_GROUP_TYPE = "GroupType";

   String OBJ_TYPE_DOCTEMP = "Doctemp";
   
   String OBJ_TYPE_CALENDAR = "Calendar";

   // add for cr 76296 start
   String OBJ_TYPE_PARTNER = "Partner";

   // cr 76296 end
   String OBJ_TYPE_PROJECT_ICON = "ProjectIcon";

   String OBJ_TYPE_EMPLOYMENTTYPE = "EmploymentType";

   String OBJ_TYPE_HRFORM = "HRForm";
   
   String OBJ_TYPE_APPRAISALFORM = "Appraisal"; 
   
   String OBJ_TYPE_APPRAISALFLOW = "AppraisalFlow"; 
   
   String OBJ_TYPE_APPFORMMEASURMENET = "Measurmenet"; 

   String OBJ_TYPE_HR_APPRAISALFORM = "HRAppsForm";

   String OBJ_TYPE_HR_ASSESSMENTFORM = "HRAssmForm";

   String OBJ_TYPE_LAYOUT_PAGE = "LayoutPage";

   String OBJ_TYPE_LAYOUT_SECTION = "LayoutSection";

   String OBJ_TYPE_LAYOUT_FIELD = "LayoutField";

   String OBJ_TYPE_AGENDA_MEETING_DECISION = "AgendaMtDec"; // 会议决策


   String OBJ_TYPE_RECRUITMENT = "Recruitment";

   String OBJ_TYPE_STOCKCHECK = "StockCheck"; // 产品库存盘点
   
   String OBJ_TYPE_STOCKCHECK_ADJUSTDIFF = "CheckAdjust"; // 产品库存盘点(调整差异)

   String OBJ_TYPE_COMMON_GROUPING = "CommonGrouping";

   String OBJ_TYPE_COMMON_GROUPING_MEMBER = "CommonGroupingMember";
   
   String OBJ_TYPE_REVENUE_ITEM = "RevenueItem";
   
   String OBJ_TYPE_BUDGET_CLASS_EXT = "BClassExt";
   
   String OBJ_TYPE_COMPANY_APPRAISAL = "CompAppr";
   
   String OBJ_TYPE_COMPANY_APPRAISAL_SCORE = "CompApprSc";
   
   String OBJ_TYPE_SUP_APPRAISAL_SCORE = OBJ_TYPE_COMPANY_APPRAISAL_SCORE;
   
   String OBJ_TYPE_PROJECTREQUEST_NOT_ASSOCIATE_PROJECT = "ProjectRequestNotAssociateProject";

   String UI_TYPE_TAB = "uiTypeTab";

   String UI_TYPE_LINE = "uiTypeLine";

   String UI_TYPE_CIRCLE = "uiTypeCircle";

   String UI_TYPE_NONE = "uiTypeNone";

   String VIEWFIELD_GETBY_VIEWID = "ViewField_getByViewId";

   String VIEW_GETBY_VIEWNAME = "View_getByViewName";

   String VIEW_GETBY_VIEWNAME2 = "View_getByViewName2";

   String VIEW_GETBY_VIEWID = "View_getByViewId";

   String CONOTIFY_GETBY_COID = "CoNotify_getByCoId";

   String COVERSION_GETBY_COID = "CoVersion_getByCoId";

   String RELATIONSHIP_GETBY_RELID = "Relationship_getByRelId";

   String RELATIONSHIP_GET_ALL = "Relationship_getAll";

   String RELATIONSHIP_GETBY_RELNAME = "Relationship_getByRelName";

   String RELOBJ_GETBY_RELATIONSHIPID = "RelObj_getByRelationshipId";

   String RELOBJ_GETBY_FROMOBJ = "RelObj_getByFromObj";

   String RELOBJ_GETBY_FROMOBJ_ONLY = "RelObj_getByFromObjOnly";

   String RELOBJ_GETBY_OBJ = "RelObj_getByObj";

   String RELOBJ_GETBY_TOOBJ = "RelObj_getByToObj";

   String RESOURCESPROP_GETBY_RESID = "ResourcesProp_getByResId";

   String RESOURCESALLOCATESIMPLE_GETBY_PROJECTID = "ResourcesAllocateSimple_getByProjectId";

   String RESOURCESALLOCATESIMPLE_GETALLBY_PROJECTID = "ResourcesAllocateSimple_getAllByProjectId";

   String RESOURCESALLOCATESIMPLE_GETALLBY_PROJECTS = "ResourcesAllocateSimple_getByProjects";

   String RESOURCESUSAGE_GETBY_PROJECTID = "ResourcesUsage_getByProjectId";

   String RESOURCESUSAGE_GET_NONINVOICE_BY_PROJECTID = "ResourcesUsage_getNonInvoiceByProjectId";

   String TIMESHEET_GETAPPROVEDBY_PROJECTID = "TimeSheet_getApprovedByProjectId";

   String TIMESHEET_GET_NONINVOICE_BY_PROJECTID = "TimeSheet_getNonInvoiceByProjectId";

   String RESOURCESTYPEPROP_GETBY_RESTYPEID = "ResourcesTypeProp_getByResTypeId";

   String RESOURCESTYPEPROP_GETBY_RESTYPEIDANDPROPERTYTYPEEXT = "ResourcesTypeProp_getByResTypeIdAndPropertTypeExt";

   String RESOURCESTYPEPROP_GETBY_RESTYPEIDANDPROPERTYTYPEEXTISNULL = "ResourcesTypeProp_getByResTypeIdAndPropertTypeExtIsNull";

   String RESOURCESTYPEPROP_GETBY_NAME = "ResourcesTypeProp_getByName";

   String RESOURCESTYPEPROP_GETBY_NAME2 = "ResourcesTypeProp_getByName2";

   String RESOURCESTYPEPROP_GET_MAXORD = "ResourcesTypeProp_getMaxOrd";

   String RESOURCESTYPEPROP_GET_MAXORDANDPROPERTYTYPEEXTISNULL = "ResourcesTypeProp_getMaxOrdAndPropertyTypeExtIsNull";

   String RESOURCESTYPEPROP_GET_MAXORDANDPROPERTYTYPEEXT = "ResourcesTypeProp_getMaxOrdAndPropertyTypeExt";

   String RESTYPEPROPITEM_GETBY_RESTYPEPRROPID = "ResTypePropItem_getByResTypePropId";

   String DELIVERABLE_GETBY_JOB = "Deliverable_getByJob";

   String DEL_VER_PASS = "ItemVerPass";

   String DEL_VER_FAIL = "ItemVerFail";

   String DEL_VER_REVERT = "ItemVerRevert";

   String DEL_ITR_PASS = "ItemItrPass";

   String DEL_ITR_FAIL = "ItemItrFail";

   String DEL_ITR_REVERT = "ItemItrRevert";

   String DEPEND_ITR_PASS = "DepItrPass";

   String DEPEND_ITR_FAIL = "DepItrFail";

   String DEPEND_ITR_REVERT = "DepItrRevert";

   String DEL_VER_SUB_REASON = "ItemVerSubReason";

   String SUBMIT_REASON_CHECKTYPE = "checkType";

   String ITEM_GET_MILESTONE_BY_PROJECTID = "item_getMilestoneByProjectId";

   String COMMITMENT_GETBY_CITYPE = "Commitment_getByCIType";

   String COMMITMENT_GET_LASTEVENT = "Commitment_getLastEvent";

   String COMMITMENT_GET_LASTACTIONEVENT = "Commitment_getLastActionEvent";

   String COMMITMENTUSER_GETBY_USERSTATUS = "CommitmentUser_getByUserAndStatus";

   String COMMITMENTITEMUSER_GETBY_USERSTATUS = "CommitmentItemUser_getByUserAndStatus";

   String APPTEMP_LIST = "appTemp_List";

   String APPTEMP_BYNAME = "appTemp_ByName";

   String CALENDAR_GETALL = "Calendar_getAll";

   String CALENDAR_GETBY_ID = "Calendar_getById";

   String CALENDAR_GETBY_NAME = "Calendar_getByName";

   String CALENDAR_GETBY_NAME2 = "Calendar_getByName2";

   String CALENDAR_GETDEFAULT = "Calendar_getDefault";

   String CALENDARDAY_GETBY_ID = "CalendarDay_getById";

   String CALENDARDAY_GET_ALL = "CalendarDay_getAll";

   String CALENDARHOUR_GET_ALL = "CalendarHour_getAll";

   String CALENDARHOLIDAY_GET_ALL = "CalendarHoliday_getAll";

   String CALENDARHOLIDAY_GETBY_CALENDARID = "getHolidayByCalId";

   String RFIPARTISIPANTCONTRACT_GETBY_RPID = "RfiPartisipantContract_getByRpId";

   // String BUDGET_GETBY_JOBID = "Budget_getByJobId";
   String BUDGET_GET_TOBEAPPROVED = "Budget_get_toBeApproved";

   String BUDGET_GET_TOBEAPPROVED_BYOWNER = "Budget_get_toBeApprovedByOwner";

   // String BUDGET_GET_USEDBUDGET_BY_JOBID = "Budget_getUsedBudgetByJobId";
   // String BUDGET_GETBY_PROJECTID = "Budget_getByProjectId";
   String BUDGET_GETBY_PROJECTID_TOCOPY = "Budget_getByProjectIdToCopy";

   // String BUDGET_GETBY_TYPEANDPROJECTID = "Budget_getByTypeAndProjectId";
   // String BUDGET_GETBY_JOBID_TYPE = "Budget_getByJobIdAndType";
   // String BUDGET_GETBY_JOBID_TYPE_CLASSID =
   // "Budget_getByJobIdAndTypeAndClassId";
   // String BUDGET_GETBY_BUDGETID_TYPE = "Budget_getByBudgetIdAndType";
   // String BUDGET_GET_USED_BY_PLAN = "Budget_getUsedByPlan";
   // String BUDGET_GETBY_PLANBUDGETID = "Budget_getByPlanBudgetId";
   // String BUDGET_GETBY_BUDGETNAME = "Budget_getByBudgetName";
   // String BUDGET_GETBY_BUDGETNAME2 = "Budget_getByBudgetName2";
   // String BUDGET_GETBY_USE_TYPE = "Budget_getByUseAndType";
   // String BUDGET_GET_ALL = "Budget_getAll";
   // String BUDGET_GETBY_USEBUDGETID = "Budget_getByUseBudgetId";
   String BUDGET_GETBY_PARENTBUDGETID = "Budget_getByParentBudgetId";

   String BUDGET_GETBY_PARENTBACTUALID = "Budget_getByParentBActualId";

   // String BUDGET_GETBY_RESID = "Budget_getByResId";
   // String BUDGET_GETBY_RESID2 = "Budget_getByResId2";
   // String BUDGET_GET_RESBUDGET_BY_JOB = "Budget_getResBudgetByJob";
   String BUDGET_CANDELETEPROJECT = "Budget_canDeleteProject";

   String BUDGET_GROUPBY_BCLASS_TYPE = "Budget_groupByBClassType";

   // String BUDGET_ISRESPOF_BUDGETORJOB = "Budget_isRespOfBudgetOrJob";
   // String BUDGETACTUAL_GET_RESBUDGETACTUAL_BY_JOB =
   // "BudgetActual_getResBudgetActualByJob";
   String BUDGETUSER_GETBY_BUDGETID = "BudgetUser_getByBudgetId";

   String BUDGETUSER_GETBY_PROJECTID_TOCOPY = "BudgetUser_getByProjectIdToCopy";

   String BUDGETUSER_GETBY_INVOLVEMENT = "BudgetUser_getByInvolvement";

   String BUDGETUSER_GET_USER_BY_INVOLVEMENT = "BudgetUser_getUserByInvolvement";

   String BUDGETACTUAL_GETBY_BUDGETID = "BudgetActual_getByBudgetId";

   // String BUDGETACTUAL_GETBY_PROJECTID = "BudgetActual_getByProjectId";
   // String BUDGETACTUAL_GETBY_JOBID = "BudgetActual_getByJobId";
   String BUDGETACTUAL_CANDELETE_OWNER = "BudgetActual_canDeleteOwner";

   String BUDGETQUARTER_SNAPSHOT_GETBY_OBJ = "BudgetQuarterSnapshot_getByObject";

   String BUDGETQUARTERSNAPSHOT_GET_APPROVED_BY_JOBID = "BudgetQuarterSnapshot_getApprovedByJobId";

   String BUDGETQUARTERSNAPSHOT_GET_APPROVED_DEP_BY_JOBID = "BudgetQuarterSnapshot_getApprovedDepByJobId";

   String BUDGETQUARTERSNAPSHOT_HAVE_EVER_APPROVED_BY_JOBID = "BudgetQuarterSnapshot_haveEverApprovedByJobId";

   String BUDGETCLASS_SNAPSHOT_GETBY_OBJ = "BudgetClassSnapshot_getByObject";

   String BUDGETRESERVE_GETBY_BUDGETID = "BudgetReserve_getByBudgetId";

   String BUDGETRESERVE_GETBY_PROJECTID = "BudgetReserve_getByProjectId";

   String BUDGETRESERVEEVENT_GETBY_BUDGETID = "BudgetReserveEvent_getByBudgetId";

   String BUDGETRESERVEEVENT_GETBY_RESERVEBUDGETID = "BudgetReserveEvent_getByReserveBudgetId";

   String COMMITMENT_COUNT_COMMITTED = "Commitment_getCommittedCount";

   String COMMITMENT_COUNT_FULFILLED = "Commitment_getFulfilledCount";

   String COMMITMENT_COUNT_BRKFULFILL = "Commitment_getBrkFulfillCount";

   String COMMITMENT_COUNT_BRKNOTFUFILL = "Commitment_getBrkNotFulfillCount";

   String COMMITMENT_COUNT_BREAKOTHER = "Commitment_getBreakOtherCount";

   String COMMITMENT_COUNT_COMMITTED_TIME = "Commitment_getCommittedCount_time";

   String COMMITMENT_COUNT_FULFILLED_TIME = "Commitment_getFulfilledCount_time";

   String COMMITMENT_COUNT_BRKFULFILL_TIME = "Commitment_getBrkFulfillCount_time";

   String COMMITMENT_COUNT_BRKNOTFUFILL_TIME = "Commitment_getBrkNotFulfillCount_time";

   String COMMITMENT_COUNT_BREAKOTHER_TIME = "Commitment_getBreakOtherCount_time";

   String COMMITMENT_GET_COMMITTED = "Commitment_getCommitted";

   String COMMITMENT_GET_FULFILLED = "Commitment_getFulfilled";

   String COMMITMENT_GET_BRKFULFILL = "Commitment_getBrkFulfill";

   String COMMITMENT_GET_BRKNOTFUFILL = "Commitment_getBrkNotFulfill";

   String COMMITMENT_GET_BREAKOTHER = "Commitment_getBreakOther";

   String COMMITMENT_GET_OVERDUECOUNT = "Commitment_getOverdueCount";

   String COMMITMENT_GET_OVERDUEDATA = "Commitment_getOverdueData";

   String DELIVERABLE_EVENT_GETBY_ITEM = "listEventByItem";

   String TIPS_GET_MAXTIPID = "Tips_getMaxTipId";

   String ISSUE_GET_BY_ASSOCIATE = "Issue_getIssueByAssociate";

   String ISSUE_GET_BY_ASSOCIATEEX = "Issue_getIssueByAssociateEx";

   String ISSUE_DELETE_BY_ID = "Issue_deleteById";

   String TABLE_TITLE = "$table_title";

   String TABLE_FUNCTIONS = "$table_functions";

   String TABLE_TD_COUNT = "$table_tdCount";

   String VALUE_COLISTSHOWTIPS_SHOW = "CoListShow";
   
   String OBJ_TYPE_QUICK_QUOTE_REQUEST = "QuickQuoteRequest";

   short VALUE_PMOPENLEVEL_DEFAULT_MIN = 1;

   short VALUE_PMOPENLEVEL_DEFAULT_MAX = 5;

   short VALUE_COSTDSPLEVEL_DEFAULT_MIN = 1;

   short VALUE_COSTDSPLEVEL_DEFAULT_MAX = 5;

   int CO_SUBMISSIONDATE_ID = -2;

   int CO_SUBMITTEDBY_ID = -3;

   int CO_TS_ID = -4;

   int CO_TSUSER_ID = -5;

   int CO_PROJECT_ID = -40;
   
   int CO_PROJECT_REQUIREMENT_ID = -165;
   
   int CO_PROJECT_ACTIVITY_ID = -166;

   int CO_TEMPLATE_ID = -7;

   int CO_CO_ID = -8;

   int CO_PREVIOUS_STATUS_ID = -9;

   int CO_SUMMARY = -20;

   int CO_RESPONSIBLE = -21;

   int CO_DUPLICATED_CO = -22;

   int CO_DUPLICATED_CO_DELETE = -220;

   // int CO_DUE_DATE = -23;
   int CO_ASSIGNED_TO = -24;

   int CO_REQUSTED_BY = -25;

   // int CO_DESCRIPTION = -26;
   int CO_STATUS = -27;

   int CO_RESOLUTION_DATE = -28;

   int CO_IMPLEMENTATION_DATE = -29;

   int CO_PRODUCT = -30;

   int CO_PRODUCT_VERSION = -31;

   int CO_REFUSE_COUNT = -32;

   int CO_SEVERITY = -33;

   int CO_ACTUAL_COMPLETE_DATE = -34;

   int CO_CC = -35;

   int CO_DELIVERY_DATE = -36;

   int CO_CR_TYPE = -37;

   int CO_PLAN_DELIVERY_DATE = -38;

   int CO_REQUIRED_FINISH_DATE = -39;

   int CO_REQUEST_DATE = -134;

   int CO_SCHEDULED_IMPLEMENTATION_FD = -137;

   int CO_ACTUAL_IMPLEMENTATION_FD = -138;

   int CO_REQUESTING_PROJECT = -139;

   int CO_DELIVERABLE = -41;

   int CO_APPROVAL_STATUS = -103;

   int CO_CHILD_CO = -119;

   int CO_PARENT_CO = -121;

   int CO_CHILD_CO_DELETE = -1190;

   int CO_RESOLUTION_DELIVERABLES = -120;

   int CO_REQUEST_GROUPS = -123;

   int CO_ACTUAL_PRODUCTION_DATE = -125;

   int CO_RESOLUTION_LINK_TO_DELIVERABLES = -126;

   int CO_PARENT_PRODUCT = -127;

   // int CO_PRODUCT_TRANSACTION_CODE = -128;

   int CO_RESPONSIBLE_GROUPS = -129;

   int CO_FUNCTIONAL_AREA = -130;

   int CO_DISCOVER_PHASE = -131;

   int CO_PROBLEM_TYPE = -132;

   int CO_PROBLEM_SUB_TYPE = -133;

   int CO_DOCUMENT = -42;

   int CO_DOCUMENT_VERSION = -44;

   int CO_CHANGE_ITEM_TYPE = -43;

   // add lastUpdatedBy and lastUpdatedTime as coExtend
   int CO_LAST_UPDATED_BY = CO_TSUSER_ID;

   int CO_LAST_UPDATE_DATE = CO_TS_ID;

   int CO_ATTACHMENT = -100;

   int CO_COMMENT = -101;

   int CO_DESCRIPTION = 20;

   int CO_RELATIONSHIP = -102;

   int CO_VERSION = -104;

   int CO_VERSION_SCHEDULED_RELEASE_DATE = -150;

   int CO_VERSION_ACTUAL_RELEASE_DATE = -151;

   int CO_PATCH = -105;

   int CO_AGE = -106;

   int CO_ATTACHMENT_DELETE = -107;

   int CO_URGENCY = -108;

   int CO_COMMITMENT_INSERT = -109;

   int CO_COMMITMENT_DELETE = -110;

   int CO_PLAN_INSERT = -111;

   int CO_PLAN_DELETE = -112;

   int CO_QUEUE = -113;

   int CO_FIELD_REMOVED = -1000;

   // removable fields
   int CO_RESOURCE_ID = -50;

   int CO_CLIENT_ID = -60;

   int CO_CALL_TYPE_ID = -70;

   int CO_RESOURCE_DAY_ID = -80;

   int CO_RESPONSE_TO_CLIENT_ID = -90;

   int CO_RESOLUTION_METHOD = 15;

   int CO_RESOLUTION_METHOD_DESC = 7;

   int CO_WORKAROUND = 11;

   int CO_SHOW_WORKAROUND = -135;

   int CO_SHOW_RES_ALLOCATION = -136;

   int CO_REQ_TYPE = -140;

   int CO_REQUESTING_CONTRACT = -141;

   int CO_BILLABLE = -142;

   int CO_CONTRACT_AMOUNT_CURRENCY = -143;

   int CO_ADDITIONAL_AMOUNT_CURRENCY = -144;

   int CO_CONTRACT_AMOUNT = -145;

   int CO_ADDITIONAL_AMOUNT = -146;

   int CO_AMOUNT_CURRENCY = -147;

   int CO_AMOUNT = -148;

   int CO_BILLABLE_AMOUNT = -149;

   int CO_RES_ALLOCATION_D = -10001;

   int CO_RES_ALLOCATION_I = -10002;

   int CO_RES_ALLOCATION_U_FROM = -10003;

   int CO_RES_ALLOCATION_U_TO = -10004;

   int CO_RES_ALLOCATION_U_HOUR = -10005;

   /** begin customized code section of Customer c0019 * */
   int CO_BATCH_PLAN = -100190001;

   /** end customized code section of Customer c0019 * */
   int CO_MEASURABLE_BENEFIT_CUR = -160;
   
   int CO_MEASURABLE_BENEFIT = -161;
   
   int CO_JUSTIFICATION = -162;
   
   int CO_PROJ_REQ = -163;
   
   int CO_REQUIREMENT_TYPE = -164;

   int FILTER_CC = -1;
   
   Integer CANDIDATE_TYPE_RESUME = -101;
   
   Integer CANDIDATE_TYPE_INTERVIEWING = -107;
   
   Integer CANDIDATE_TYPE_LETTER_SENT = -104;
   
   Integer CANDIDATE_TYPE_ONBORD = -105;
   
   Integer CADIDATE_TYPE_WAIT = -103;

   // String CO_DESCRIPTION_NAME = "description";
   String CO_DEADLINE_NAME = "deadline";

   String CO_ASSIGNEDTO_NAME = "assignedTo";

   String CO_SUBMISSIONDATE_NAME = "submissionDate";

   String CO_SUBMITTEDBY_NAME = "Submitted By";

   String CO_SUMMARY_NAME = "summary";

   String CO_TS_NAME = "ts";

   String CO_TSUSER_NAME = "Last Update By";

   String CO_PROJECT_NAME = "Project";

   String CO_COID_NAME = "Co Id";

   String CO_TEMPLATE_NAME = "Template";

   String CO_APPROVAL_STATUS_NAME = "ApprovalStatus";

   String IDCOUNTER_GET_BY_NAME = "IdCounter_getByName";

   String BUDGETCLASS_GET_MAXORD_BY_PARENTID = "BudgetClassGetMaxOrdByParentId";

   String BUDGETCLASS_GETBY_OWNER = "BudgetClassGetByOwner";

   String BUDGETCLASS_GETBY_OWNER2 = "BudgetClassGetByOwner2";

   String BUDGETCLASS_GETBY_OWNER3 = "BudgetClassGetByOwner3";

   String BUDGETCLASS_GETBY_OWNER4 = "BudgetClassGetByOwner4";
   
   String BUDGETCLASSB_GETBY_OWNER = "BudgetClassBGetByOwner";

   String BUDGETCLASS_GETBY_OWNER_FORDELETE = "BudgetClassGetByOwnerForDelete";

   String BUDGETCLASS_GET_RELATED_BY_OWNER = "BudgetClass_GetRelatedByOwner";

   String BUDGETCLASS_GETALLBY_OWNER = "BudgetClassGetAllByOwner";

   String BUDGETCLASS_GETALLBY_OWNER2 = "BudgetClassGetAllByOwner2";

   String BUDGETCLASS_GETALLBY_OWNER_WITHOUT_RESERVE = "BudgetClassGetAllByOwnerWithoutReserve";

   String BUDGETCLASS_GETBY_NAME = "BudgetClass_getByName";

   String BUDGETCLASS_GETBY_NAME2 = "BudgetClass_getByName2";

   String JOB_GET_BY_ID = "Job_getById";

   String JOB_GET_ALL_JOB = "Job_getAllJob";

   String JOB_GET_ROOT_JOB = "Job_getRootJob";

   String JOB_GET_CHILDREN = "Job_getChildren";

   String JOB_GET_CLOSEST = "Job_getClosest";

   String JOB_GET_NOTCOMPLETE_PROJ = "Job_getNotCompleteProj";

   String JOB_GET_NEEDTO_CALCBUDGET = "Job_getNeedToCalcBudget";

   String JOB_GET_JOBID_BY_PROJECTID = "Job_getJobIdByProjectId";

   String JOBTREE_GETBY_PARENTID = "JobTree_getByParentId";

   String JOBTREE_GETBY_ROOTID = "JobTree_getByRootId";

   String JOBTREE_GETBY_ROOTID_INC_SUBPROJECT = "JobTree_getByRootIdIncSubProject";

   String JOB_GETBY_ROOT = "Job_getJobByRoot";

   String JOBMEMBER_GETBY_JOB = "JobMember_getMembersByJob";

   String JOBMEMBER_IS_PLANNER_OR_RESP = "JobMember_isPlannerOrResp";

   String JOBMEMBER_GET_PLANNER_OR_RESP = "JobMember_getPlannerOrResp";

   String JOBPOLICY_GET_PROJECT_PMO_SYS_POLICY_BY_PROJECTID = "JobPolicy_getProjectPmoSysPolicyByProjectId";

   String JOBPOLICY_GET_PMO_SYS_POLICY_BY_PROJECTID = "JobPolicy_getPmoSysPolicyByProjectId";

   String USERGROUP_GET_ALL = "UserGroup_getAll";

   String USERGROUP_GET_BY_CRITERIA = "UserGroup_getByCriteria";

   String USERGROUP_GET_GROUPS = "UserGroup_getGroupsByGroupId";

   String USERGROUP_GET_PARENT_GROUP = "UserGroup_getParentGroups";

   String USERGROUP_GET_USERS = "UserGroup_getUsersByGroupId";

   String USERGROUP_GET_COMPANIES = "UserGroup_getCompaniesByGroupId";

   String USERGROUP_GET_ROLES = "UserGroup_getRolesByGroupId";

   String GROUPMEMBER_GET_BY_MEMBERID = "Groupmember_getGroupmembersByMemberId";

   String GROUPMEMBER_GET_BY_GROUPID = "Groupmember_getGroupmembersByGroupId";

   String GROUPMEMBER_GET_BY_PK = "Groupmember_getGroupmemberByPK";

   String USERGROUP_GETBY_MEMBERID = "UserGroup_getGroupsByMemberId";

   String COMPANY_GETBY_COMPANYNAME = "Company_getByCompanyName";

   String COMPANY_GETBY_COMPANYID = "Company_getByCompanyId";

   String COMPANY_GET_ACTIVECOMPANY = "Company_getActiveCompany";

   String COMPANY_GETALL_ACTIVECOMPANY = "Company_getAllActiveCompany";

   String COMPANY_GETUSERS_BY_COMPANYID = "Company_getUsersByCompanyId";

   String COMPANYMEMBERS_IN_ONE_COMPANY = "CompanyMembers_inOneCompany";

   String COMPANY_COMPANYNO_COUNT = "Company_CompanyNo_Count";

   String FILTER_GETBY_USER_TYPE = "Filter_getByUserAndType";

   String FILTER_GETBY_USER_TYPE2 = "Filter_getByUserAndType2";

   String FILTER_GETFIXBY_USER_TYPE = "Filter_getFixByUserAndType";

   String FILTER_GETBY_JOBID_TYPE = "Filter_getByJobIdAndType";

   String FILTER_GET_DEFAULT = "Filter_getDefaultByUserAndType";

   String FILTER_GETCRITERIA = "Filter_getCriteria";

   String FILTERPRODUCT_GETBY_FILTERID = "FilterProduct_getByFilterId";

   String FILTERCRITERIA_GETBY_USER_TYPE = "FilterCriteria_getByUserAndType";

   String APPSTEPUSER_GETUSER = "AppStepUser_getUsersByApprovalStep";

   String APPSTEPUSER_GETPARTYUSER = "AppStepUser_getRespsByApprovalStep";

   String APPSTEP_GET_NEXTSTEPS = "AppStep_getNextSteps";

   String APPSTEP_GET_FINALSTEPS = "AppStep_getFinalSteps";

   String APPSTEP_GETCURRENTSTEPS_BYUSER = "AppStep_getCurrentStepsByUser";

   String APPSTEPUSER_GETPARTYBYSTEP = "AppStepUser_getPartyByApprovalStep";

   String APPSTEPUSER_GETAPPSTEPUSERBYAPP = "AppStepUser_getApprovalStepUsersByApproval";

   String APPEVENT_GETUSER_CURRENTEVENT = "AppEvent_getUserCurrentEvent";

   String APPSTEP_GET_BEGINSTEPS = "ApprovalStep_getBeginningSteps";

   String CURRENCY_GETMAXTS = "Currency_getMaxTs";

   // String FILTER_GET_VIEWFILTERS = "Filter_getAllViewFilters";
   String FILTER_GETBY_TYPE = "Filter_getByType";

   String FILTER_GETBY_TYPE_STATUS = "Filter_getByTypeStatus";

   String FILTER_GETBY_TYPE_STATUS_2 = "Filter_getByTypeStatus2";

   String FILTER_GETBY_UNIQUE_KEY = "Filter_getByUserAndFilterName";

   String FILTER_GETBY_UNIQUE_KEY_2 = "Filter_getByUserAndFilterName2";

   String ALERT_GETBY_FILTERID = "AlertMember_getByFilterId";

   String ESCALATE_GETBY_FILTERID = "FilterEscalate_getByFilterId";

   String ESCALATEOBJ_GETBY_FILTERID = "FilterEscalateObj_getByFilterId";

   String ESCALATEOBJ_GETBY_FILTERIDORD = "FilterEscalateObj_getByFilterIdOrd";

   String SCHEDULE_GETALL = "Schedule_getAll";

   String SCHEDULE_GETBY_OBJIDTYPE = "Schedule_getByObjIdType";
   
   String OBJ_TYPE_PRODUCT_INVENTORY_EXPIRYDATE = "PdtInventory";
   
   String OBJ_TYPE_EMAIL_CAMPAIGN  = "emailCampaign";
   
   String OBJ_TYPE_SYSTEM = "System";
   
   // User Report removed on 2005-09-23
   // String GET_USER_REPORT_LIST_BY_TYPEID =
   // "RptUser_getUserReportListByTypeId";
   // String GET_USER_REPORT_BY_RPTID = "RptUser_getUserReportByRptId";
   // String KEY_USER_REPORT_LIST = "UserReportList";
   // String KEY_USER_REPORT_NAME = "UserReportName";
   int EMPTY_OPTION_SIZE = 10;

   String OPERATOR_LARGER = ">";

   String OPERATOR_EQUALSLARGER = ">=";

   String OPERATOR_EQUALS = "=";

   String OPERATOR_EQUALSLESS = "<=";

   String OPERATOR_LESS = "<";

   String OPERATOR_NOT_EQUALS = "≠";
   
   String OPERATOR_IN = "In";

   String OPERATOR_NOTIN = "Not In";

   String OPERATOR_ISNULL = "IsNull";

   String OPERATOR_LIKE = "Like";

   String OPERATOR_CHANGEFROM = "From";

   String OPERATOR_CHANGETO = "To";

   String OPERATOR_ISCHANGED = "Changed";

   String NAME_OPERATOR_LARGER = "name.operator.larger";

   String NAME_OPERATOR_EQUALSLARGER = "name.operator.equalsLarger";

   String NAME_OPERATOR_EQUALS = "name.operator.equals";

   String NAME_OPERATOR_EQUALSLESS = "name.operator.equalsLess";

   String NAME_OPERATOR_LESS = "name.operator.less";

   String NAME_OPERATOR_LARGER_DATE = "name.operator.larger.date";

   String NAME_OPERATOR_EQUALSLARGER_DATE = "name.operator.equalsLarger.date";

   String NAME_OPERATOR_EQUALS_DATE = "name.operator.equals.date";

   String NAME_OPERATOR_EQUALSLESS_DATE = "name.operator.equalsLess.date";

   String NAME_OPERATOR_LESS_DATE = "name.operator.less.date";

   String NAME_OPERATOR_IN = "name.operator.in";

   String NAME_OPERATOR_NOTIN = "name.operator.notIn";

   String NAME_OPERATOR_CONTAIN = "name.operator.contain";

   String NAME_OPERATOR_CHANGEFROM = "name.operator.changeFrom";

   String NAME_OPERATOR_CHANGETO = "name.operator.changeTo";

   String NAME_OPERATOR_ISCHANGED = "name.operator.isChanged";

   String FIELD_RIGHT_WRITE = "W";

   String FIELD_RIGHT_READ = "R";

   String ROLE_GETALL_ORDERBY = "Role_getAllRolesOrderBy";

   String SPECIAL_ROLE = "specialRole";

   // Runtime constants
   String CURRENT_COMPANY = "CURRENT COMPANY";

   String CURRENT_USER = "CURRENT USER";

   String CURRENT_USER_RESOURCE = "CURRENT USER RESOURCE";

   String CURRENT_DATE = "CURRENT DATE";

   String NOW_SQL = "Select t from now";

   String DIRECT_TYPE = "directType";

   String ERRORPAGE = "com.gearteks.common.ErrorPage";

   // Support object types
   String ALL_OBJECT_TYPES = "CO,DOC";

   // Project of Document.
   String PROJECT_GET_ALL = "Project_getAll";

   String PROJECT_GETBY_PROJECTID = "Project_getByProjectId";

   String PROJECT_GETBY_PROJECTNAME = "Project_getByProjectName";

   // Product version member
   String PRODUCT_VERSION_MEMBER_GETBY_OBJ = "ProductVersionMember_getByObj";

   String PRODUCT_PATCH_MEMBER_GETBY_OBJ = "ProductPatchMember_getByObj";

   String PRODUCT_GETBY_USERID = "Product_getByUserId";

   String PRODUCT_HAS_COPERMISSION = "Product_hasCoPermission";

   String PRODUCTTEMP_GET_TEMP_BY_PRODUCTID = "ProductTemp_getTempByProductId";

   String PRODUCTTEMP_GET_PRODUCT_BY_TEMPLATEID = "ProductTemp_getProductByTemplateId";

   String PRODUCTTEMP_GETBY_PRODUCTID = "ProductTemp_getByProductId";

   String PRODUCTTEMP_GETBY_TEMPLATEID = "ProductTemp_getByTemplateId";

   String PRODUCTTEMP_GET_ONETEMPPRODUCT = "ProductTemp_getOneTempProduct";

   String PRODUCTINTERNALPERMISSION_GETBY_PRODUCTID = "ProductInternalPermission_getByProductId";

   String PRODUCTINTERNALPERMISSION_GET_PRODUCT_BY_USERID = "ProductInternalPermission_getProductByUserId";

   String PRODUCTINTERNALPERMISSION_GET_PRODTEMP_BY_USERID = "ProductInternalPermission_getProdTempByUserId";

   String PRODUCTINTERNALPERMISSION_GET_COTEMPLATE = "ProductInternalPermission_getCoTemplate";

   String PRODUCTINTERNALPERMISSION_GET_VERSION_BY_USERID = "ProductInternalPermission_getVersionByUserId";

   String COMPANYPRODLIC_GET_PRODUCT_BY_USERID = "CompanyProdLic_getProductByUserId";

   String COMPANYPRODLIC_GET_PRODTEMP_BY_USERID = "CompanyProdLic_getProdTempByUserId";

   String COMPANYPRODLIC_GET_COMPANY_BY_TEMPLATEID = "CompanyProdLic_getCompanyByTemplateId";

   String COMPANYPRODLIC_GET_COTEMPLATE = "CompanyProdLic_getCoTemplate";

   String COMPANYPRODLIC_GET_VERSION_BY_USERID = "CompanyProdLic_getVersionByUserId";

   // Product version generate
   String PV_GEN_ERRS = "productVersionGenerateErrors";

   String PV_IGNORED_REVS = "productVersionIgnoredRevsions";

   // Document type
   String DOCTYPE_GET_ALL = "DocType_getAll";

   String DOCTYPE_GETBY_DOCTYPEID = "DocType_getByDocTypeId";

   String DOCTYPE_GETBY_DOCTYPENAME = "DocType_getByDocTypeName";

   // Document
   String DOCUMENT_GET_ALL = "Document_getAll";

   String DOCUMENT_GETBY_DOCID = "Document_getByDocId";

   // Document version
   String DOCUMENTVERSION_GETBY_DOCID = "DocumentVersion_getByDocId";

   String ERROR_KEY = "error_key_key";

   String PARTY_USERTYPE_RESPONSIBLE = "Resp";

   String PARTY_USERTYPE_MEMBER = "Member";

   String PROJECT_TREE_MAP = "ProjectTreeMap";

   String WINDOW_CLOSE = "WindowClose";

   String WINDOW_IS_DIALOG = "isDialog";

   // Approval
   String APPROVAL_GET_ALL = "Approval_getAll";

   String APPROVAL_GETBY_STATUS = "Approval_getByStatus";

   String APPROVAL_GETBY_APPROVALID = "Approval_getByApprovalId";

   String APPROVAL_GETBY_OBJ = "Approval_getByObj";

   String APPROVAL_GETBY_OBJ_STATUS = "Approval_getByObjStatus";

   String APPROVAL_GET_LASTAPPROVAL_BY_OBJ = "Approval_getLastApprovalByObj";

   String APPROVAL_GETBY_BUDGETS = "Approval_getByBudgets";

   String APPROVAL_GETBY_OBJ_BUDGET = "Approval_getByObj_budget";

   String APPROVAL_GET_PREVIOUS = "Approval_getPreviousApprovalByObj";

   // Approval Step
   String APPROVALSTEP_GETBY_APPROVALID = "ApprovalStep_getByApprovalId";

   String APPROVALSTEP_GETALL_REQUESTED = "AppStep_getAllRequestedSteps";

   String RESPONSIBLE = "Resp";

   String PROJECTAPPRAISAL = "ProApp";

   String FINALSCORE = "FinScore";

   String TIME_SHEET_APPR = "TmShtAppr";

   String EXPENSE_APPR = "ExpAppr";

   String TIME_SHEET_FILLER = "TmShtFiller";

   String MEMBER = "Member";

   String MODIFY = "Modify";

   String REPORTTO = "ReportTo";

   String NOTIFY_FRESH = "fresh";

   String NOTIFY_SAVE = "save";

   String NOTIFY_UPDATE = "update";

   String USER_TYPE = "User";

   String PARTY_TYPE = "Party";

   String VALUE_NEW = "New";

   String VALUE_OLD = "Old";

   // Approval Event
   String APPROVALEVENT_GETBY_APPROVALID = "AppEvent_getApprovalEvent";

   String INFO_READONLY = "infoReadOnly";

   // Classified Types
   String TYPE_CO = "CO";

   String TYPE_APPROVAL = "Approval";

   String TYPE_DELIVERABLE = "Deliverable";

   String TYPE_ITEM = "Item";

   String TYPE_JOB = "Job";

   String TYPE_BUDGET = "Budget";

   String TYPE_BUDGET_ACTUAL = "BudgetActual";

   String TYPE_DOC = "Doc";

   String TYPE_DELIVERY = "Delivery";

   String TYPE_STRATEGY = "Strategy";

   String TYPE_ISSUE = "Issue";

   String TYPE_INTERACTION = "Interaction";

   // plan list in user default defining page
   String PLAN_LIST = "PlanList";

   String JOBCLASS_LIST = "jobClassList";

   String ENUM_LIST = "enumList";

   // the command of add ,update ,delete ,refresh,close etg..
   String CMD_VIEW = "view";

   String CMD_NEW = "new";

   String CMD_EDIT = "edit";

   String CMD_DELETE = "delete";

   String CMD_REFRESH = "refresh";

   String CMD_REFRESHALL = "refreshAll";

   String CMD_CLOSE = "close";

   String CMD_CLOSEANDREFRESH = "close&refresh";

   String CMD_CLOSEANDREFRESHALL = "close&refreshAll";

   String DAY_START_TIME = "00:00:00";

   String WORK_AND_HOLIDAYS = "workAndHolidays";

   // report
   String REPORT_GET_ALL = "Report_getAll";

   String REPORT_GET_BYRPTID = "Report_getByRptId";

   String REPORT_GET_BYRPTTYPE = "Report_getByRptType";

   String REPORT_GET_BYRPTUQ = "Report_getByRptUQ";

   String REPORTCOL_GET_BYRPTID = "ReportCol_getByRptId";

   String REPORTPROJECT_GET_BYRPTID = "ReportProject_getByRptId";

   String REPORTSORT_GET_BYRPTID = "ReportSort_getByRptId";

   String REPORT_LAYOUT_LANDSCAPE = "LANDSCAPE";

   String REPORT_LAYOUT_PORTRAIT = "PORTRAIT";

   String REPORT_TYPE_CO = "CO";

   String REPORT_TYPE_JOB = "Job";

   // CVS Module
   String CVSMODULE_GET_ALL = "CVSModule_getAll";

   String CVSMODULE_KEY_LIST = "CVSModule_moduleList";

   String CVSMODULE_UPDATE_ANYMODULES = "CVSModule_update_anyModules";

   String CVSMODULE_KEY_MODULE = "CVSModule_module";

   String CVSMODULE_KEY_MODULEFORM = "CVSModule_moduleForm";

   String POPUP_MODULES = "popupList";

   String NOT_STARTED = "NotStarted";

   String IN_PROGREES = "InProgrees";

   String COMPLETED = "Completed";

   String SLIPPED = "Slipped";

   String CLOSED = "Closed";

   String BAD = "Bad";

   String SHOULD_HAVE_STARTED = "ShouldHaveStarted";

   String RES_DATATYPE_MANDAY = "manday";

   String RES_DATATYPE_ACTUAL_MANDAY = "actual.manday";

   String RES_DATATYPE_COST = "cost";

   String RES_DATATYPE_ACTUAL_COST = "actual.cost";

   String RES_VIEWTYPE_SUMMARY = "summary";

   String RES_VIEWTYPE_QUARTER = "quarter";

   String RES_VIEWTYPE_MONTH = "month";

   String RES_VIEWTYPE_PROJ = "project";

   String RES_VIEWTYPE_TIMESHEET = "timesheet";

   String RES_VIEWTYPE_WORKCATA = "workcata";

   String RES_VIEWTYPE_CHARGE = "charge";

   String RES_VIEWTYPE_MONTH_ACTUAL_ALLOCATION = "month.actual.allocation";

   String RES_VIEWTYPE_QUARTER_ACTUAL_ALLOCATION = "quarter.actual.allocation";

   String RES_VIEWTYPE_MONTH_ACTUAL_COST = "month.actual.cost";

   String RES_VIEWTYPE_QUARTER_ACTUAL_COST = "quarter.actual.cost";

   String TREE = "tableTree";

   String REFRESH = "refresh";

   String CAN_SHOW_MUTI = "canShowMuti";

   String RESPONS_MSG = "display.fieldName.responsible";

   String REPORTS_MSG = "display.fieldName.reportTo";

   String TS_MSG = "display.fieldName.ts";

   String TSUSER_MSG = "display.fieldName.tsUser";

   String STATUS_MSG = "display.fieldName.status";

   String DESCRIPION_MSG = "display.fieldName.description";

   String SUMMITBY_MSG = "display.fieldName.submitBy";

   String SUMMITDATE_MSG = "display.fieldName.submitTime";

   String LABEL = "Label";

   String DIRECTION = "direction";

   String LOGIN_IN = "loginIn";

   String FIELD_NAME_LIST = "fieldNameList";

   String BUSINESS_FIELD_LIST = "businessFieldList";

   String OBJ_TYPE = "objType";

   // mail
   String MAIL_SENDER = "mail.sendby";

   String MAIL_RECEIVEUSERS = "mail.recieve.users";

   String MAIL_TOPIC = "mail.topic";

   String MAIL_CONTEXT = "mail.context";

   String MAIL_CC = "mail.cc";

   String EVENT_REQUEST = "request";

   String EVENT_RESPONSE = "response";

   String EVENT_CANCEL = "cancel";

   String EVENT = "event";

   String OBJ_TYPE_CO = "CO";
   
   String OBJ_TYPE_VERSION = "PRODUCTVERSION";

   String OBJ_TYPE_CO_QUEUE = "CoQueue";

   String OBJ_TYPE_CO_ENUM = "CoEnum";

   String OBJ_TYPE_RES = "Res";

   String OBJ_TYPE_RES_ALLOCATE = "ResAllocate";

   String OBJ_TYPE_JOB = "Job";
   
   String OBJ_TYPE_PROJECT_TYPE = "ProjectType";
   
   String OBJ_TYPE_PROJECT_ACT = "ProjAndAct";

   String OBJ_TYPE_PROJECT_REQUEST = "ProjRequest";
   
   String OBJ_TYPE_STAR_LEVEL = "StarLevel";

   String OBJ_TYPE_SUBSITE = "SubSite";

   String OBJ_TYPE_ITEM = "Item";
   
   String OBJ_TYPE_ITEM_DOC = "ItemDoc";

   String OBJ_TYPE_DELIVERABLE_FULL = "Deliverable";

   String OBJ_TYPE_ITEMEVENT = "ItemEvent";

   String OBJ_TYPE_RISKEVENT = "RiskEvent";

   String OBJ_TYPE_ITEMACCEPT = "ItemAccept";

   String OBJ_TYPE_ITEMCOMPONENT = "ItemComponent";

   String OBJ_TYPE_ITEMVERSION = "ItemVer";

   String OBJ_TYPE_ITEMVERSIONSUBMIT = "ItemVerSub";

   String OBJ_TYPE_ITEMVERSIONFILE = "ItemVerFile";

   String OBJ_TYPE_DOCUMENT = "Doc";

   String OBJ_TYPE_DOCUMENT_TYPE = "DocumentType";

   String OBJ_TYPE_DOCUMENT_EMAIL = "DocEmail";

   String OBJ_TYPE_USER = "User";

   String OBJ_TYPE_DOCUMENT_PICTURE = "DocumentPic";

   String OBJ_TYPE_DOCUMENT_PICTURE_TEMP = "DocumentPicTemp";

   String OBJ_TYPE_USER_DELEGATE = "UserDelegt";

   String OBJ_TYPE_INTERNAL_USER = "InternalUser";

   String OBJ_TYPE_EXTERNAL_USER = "ExternalUser";

   String OBJ_TYPE_RES_TYPE_PROP = "Prop";

   String OBJ_TYPE_RES_TYPE = "ResourcesType";

   String OBJ_TYPE_TRAINING = "Training";
   
   String OBJ_TYPE_TRAINING_PLAN = "TrainPlan";
   
   String OBJ_TYPE_TRAINING_SEGMENT = "TrainSegmt";
   
   String OBJ_TYPE_TRAINING_COURSE_REPETITION = "TrainCouRep";
   
   String OBJ_TYPE_VERIFICATION = "Verification";
   
   String OBJ_TYPE_LEGALPAPERMEMBERSHIP = "LegalPaperMembership";
   
   String OBJ_TYPE_CERTIFICATE = "Certificate";
   
   String OBJ_TYPE_PARTY = "Party";

   String OBJ_TYPE_FIELD = "Field";

   String OBJ_TYPE_COMMITMENT = "Commitment";

   String OBJ_TYPE_APPROVAL = "Approval";

   String OBJ_TYPE_ROLE_APPROVER = "RoleAppr";

   String OBJ_TYPE_DEFAULT_APPROVER = "defaultApprover";

   String OBJ_TYPE_FIELD_APPROVAL = "FieldAppr";

   String OBJ_TYPE_RESUBMIT = "Resubmit"; // Used in Approval-detail.

   String OBJ_TYPE_DELIVERY = "Delivery";

   String OBJ_TYPE_COMMENT = "Comment";

   String OBJ_TYPE_PROJECT = "Proj";

   String OBJ_TYPE_FILTER = "Filter";

   String OBJ_TYPE_ACTIVITY = "Act";

   String OBJ_TYPE_ATTACHMENT = "Attachment";

   String OBJ_TYPE_ATTACHMENT_TEMP = "AttachmentTemp";

   String OBJ_TYPE_ADMIN = "Admin";

   String OBJ_TYPE_RISK = "Risk";

   String OBJ_TYPE_RISK_MITIGATION = "RiskMitigation";

   String OBJ_TYPE_SERVICE_REQUEST = "ServiceReq";

   String OBJ_TYPE_SERVICE_REQUEST_ACTION = "ServiceReqAction";

   String OBJ_TYPE_BUDGET = "Budget";

   String OBJ_TYPE_BURSAR = "Bursar";

   String OBJ_TYPE_BUDGET_ACTUAL = "BudgetActual";

   String OBJ_TYPE_BUDGET_SUM = "BudgetSum";

   String OBJ_TYPE_CURRENCY = "Currency";

   String OBJ_TYPE_LIBRARY = "Library";
   
   //终端课程报表
   String OBJ_TYPE_TERMINAL_SCHEDULE = "TerSchedule";

   String OBJ_TYPE_WORKDOC = "WorkDoc";

   String OBJ_TYPE_CUSTOMFORM = "CustomForm";

   String OBJ_TYPE_CUSTOMFORM_TYPE = "CustomFormType";

   String OBJ_TYPE_COMPANY_APPROVER_STAGE = "Stage";

   String OBJ_TYPE_LICENSE = "License";

   String OBJ_TYPE_PATCH = "Patch";

   String OBJ_TYPE_GROUP = "Group";

   String OBJ_TYPE_COMPANY = "Company";

   String OBJ_TYPE_COMPANY_PROD_LIC = "CPL";

   String OBJ_TYPE_DISCUSSION = "Discussion";

   String OBJ_TYPE_DELIVERABLE = "Del";
   
   String OBJ_TYPE_DELIVERABLE_PUSH = "DelPush";

   String OBJ_TYPE_MILESTONE = "MileStone";

   String OBJ_TYPE_JOBHISTORY = "JobHistory";

   String OBJ_TYPE_JOBLOG = "JobLog";

   String OBJ_TYPE_REQUIREMENT = "Req";

   String OBJ_TYPE_DEPENDENCY = "Dep";

   String OBJ_TYPE_OBJDEPEND = "Depend";

   String OBJ_TYPE_DEPENDENCY_FULL = "Dependency";

   String OBJ_TYPE_OBJDEPEND_ITERATION = "DependIteration";

   String OBJ_TYPE_ITEM_ITERATION = "ItemIteration";

   String OBJ_TYPE_ITEMITERATION_SUBMIT = "ItemIterationSubmit";

   String OBJ_TYPE_OBJDEPEND_SUBMIT = "DependSubmit";

   String OBJ_TYPE_DELIVERY_SUBMIT = "DeliverySubmit";

   String OBJ_TYPE_DISCUSSION_MESSAGE = "DiscussionMessage";

   String OBJ_TYPE_CHAT = "Chat";

   String OBJ_TYPE_TIEMSHEET = "TimeSheet";

   String OBJ_TYPE_TIMESHEETSUBMIT = "TSSubmit";
   
   String OBJ_TYPE_ATTENDANCE_SUBMIT = "AttSubmit";

   String OBJ_TYPE_TIMESHEETPERIOD = "TSPeriod";

   String OBJ_TYPE_LEADSOURCETYPE = "LeadSourceType";

   String OBJ_TYPE_INDUSTRY = "Industry";

   String OBJ_TYPE_REGION = "Region";

   String OBJ_TYPE_SIZECATEGORY = "SizeCategory";

   String OBJ_TYPE_INTERACTIONTYPE = "InteractionType";

   String OBJ_TYPE_INTERACTIONRESULT = "InteractionResult";

   String OBJ_TYPE_INTERACTION = "Interaction";

   String OBJ_TYPE_MARKETINGTOPIC = "MarketingTopic";

   String OBJ_TYPE_MARKETINGTOPIC11 = "MarketTopic";

   String OBJ_TYPE_JURISDICTION = "Jurisdiction";

   String OBJ_TYPE_MARKETINGEVENT = "MarketingEvent";

   String OBJ_TYPE_REFERENCECHECKRESULT = "ReferenceCheckResult";

   String OBJ_TYPE_SATISFACTION_CECHECKRESULT = "SatisfacChkRelt";

   String OBJ_TYPE_TYPE = "Type";

   String OBJ_TYPE_PROJ_QUALITY = "ProjQuality";

   String OBJ_TYPE_TITLE = "Title";

   String OBJ_TYPE_LEVEL = "Level";

   String OBJ_TYPE_SHIPMENT = "Shipment";

   String OBJ_TYPE_SELECTIONSUPPLIER = "selectionsupplier";

   String OBJ_TYPE_SELECTIONROUND = "SelectionRound";

   String OBJ_TYPE_SELECTIONCRITERION = "SelectionCriterion";

   String OBJ_TYPE_SELECTIONRATING = "SelectionRating";

   String OBJ_TYPE_TERRITORY = "Territory";

   String OBJ_TYPE_LEADQUAL = "LeadQual";

   String OBJ_TYPE_REVENUE_PERIOD = "RevenuePeriod";

   String OBJ_TYPE_TRANSITIONG_GOAL = "TransitionGoal";

   String OBJ_TYPE_STRATEGY_TRANSITION = "SgTran";

   String OBJ_TYPE_INTERVIEW = "Interview";

   String OBJ_TYPE_INTERVIEW_DETAIL = "InterviewDetail";

   String OBJ_TYPE_INTERVIEW_CANDIDATE_INFO = "InvCandInfo";
   
   String OBJ_TYPE_INTERVIEW_DETAIL_REPLACE = "InvDetail";
   
   String OBJ_TYPE_DOCUMENT_READCONFIRM = "DocReadConfirm";

   String OBJ_TYPE_HRREQUISITION = "HrReq";
   
   String OBJ_TYPE_HEADCOUNT_FORECAST = "HeadcountForecast";

   String OBJ_TYPE_SEMINAR = "Seminar";

   String OBJ_TYPE_ADMIN_TYPE = "AdminType";

   String OBJ_TYPE_CLIENT_ACCOUNT = "CliAccount";

   String OBJ_TYPE_TASK = "TaskType";
   String OBJ_TYPE_ROSTER = "Roster";
   
   String OBJ_TYPE_ROSTER_SHIFT = "RosterShift";

   String OBJ_TYPE_ROTATION = "Rotation";

   String OBJ_TYPE_ROTATION_DATE = "RotationDate";
   
   String OBJ_TYPE_ROTATION_ADJUST = "RotationAdjust";
   
   String OBJ_TYPE_ROTATION_ADJUST_ITEM = "RotationAdjustItem";
   
   String OBJ_TYPE_REWARD = "Reward";
   String OBJ_TYPE_REWARD_COUPON = "RewardCoupon";
   String OBJ_TYPE_REWARD_DISCOUNT = "RewardDiscount";
   String OBJ_TYPE_REWARD_GIFT = "RewardGift";
   
   String OBJ_TYPE_REDEMPTION = "Redemption";

   String OBJ_TYPE_INVOICE_TYPE = "invoiceType";
    
   String OBJ_TYPE_RULE = "Rule";
   String OBJ_TYPE_MEMBERSHIP_REWARD = "MemReward";
   
   String OBJ_TYPE_MEMBERSHIP_LEVEL = "MemLevel";
   
   String OBJ_TYPE_MEMBERSHIP_VARIETY = "MemberShipVariety";
   
   String OBJ_TYPE_USER_RESUME = "UserResume";
   
   String OBJ_TYPE_PERSONAL_PAYROLL_INFO = "personalPayrollInfo";
    
   String OBJ_TYPE_PACKING = "Packing";
   
   int[] DATE_FORMAT_ZH = {Calendar.YEAR, Calendar.MONTH, Calendar.DATE, -1, Calendar.DAY_OF_WEEK};

   int[] DATE_FORMAT_EN = {Calendar.DAY_OF_WEEK, -1, Calendar.MONTH, Calendar.DATE, Calendar.YEAR};

   int[] DATE_FORMAT_NOWEEK_ZH = {Calendar.YEAR, Calendar.MONTH, Calendar.DATE};

   int[] DATE_FORMAT_NOWEEK_EN = {Calendar.MONTH, Calendar.DATE, -1, Calendar.YEAR};

   String STATUS_DEL = "Deleted";

   String STATUS_ACTIVET = "Active";

   String STATUS_SUSPEND = "Suspend";

   String USER_CVS_PASSWORD = "user.cvs.password";

   String METHOD_BEFORE = "beforeMethod";

   String METHOD = "method";

   String RESOURCE = "resource";

   String QUERY_ADVANCE = "advance";

   String CMD_NOTSEARCH = "notSearch";

   String APPROVAL_BYME = "approvalByMe";

   String SUMMIT_BYME = "summitByMe";

   String NEED_MYAPPROVAL = "needMyApproval";

   String QUESTIONITEM_GETBY_QUESTIONID = "QuestionItem_getByQuestionId";

   String QUESTION_GETBY_JOBID = "Question_getByJobId";

   String QUESTION_GETBY_JOBID_TYPEID = "Question_getByJobId_TypeId";

   String QUESTION_GETBY_JOBID2 = "Question_getByJobId2";

   String QUESTION_GETBY_SURVEYID = "Question_getBySurveyId";
   
   String QUESTION_GETBY_SURVEYID2_ACTIVE = "Question_getBySurveyId2_active";

   String QUESTION_GETBY_SURVEYID2 = "Question_getBySurveyId2";

   String QUESTION_GETBY_PERIODID = "Question_getByPeriodId";

   String QUESTION_GETBY_SURVEYIDANDITEMID = "Question_getBySurveyIdAndItemId";

   String QUESTION_GETBY_ITEMID = "Question_getByItemId";

   String QUESTION_GETBY_SURVEYIDANDTYPEID = "Question_getBySurveyIdAndTypeId";

   String QUESTION_GETACTIVEBY_JOBID = "Question_getActiveByJobId";

   String QUESTION_GET_SYSQUESTION_BY_JOBID = "Question_getSysQuestionByJobId";

   String QUESTIONANSWER_GETBY_QUESTION = "QuestionAnswer_getByQuestion";

   String SURVEY_GETBY_JOBID = "Survey_getByJobId";

   String SURVEY_GET_CAN_JOIN_BY_JOBID = "Survey_getCanJoinByJobId";

   String SURVEY_GET_CAN_JOIN_BY_STRATEGYID = "Survey_getCanJoinByStrategyId";
   
   String SURVEY_GET_CAN_JOIN_BY_MULTI = "Survey_getCanJoinByMulti";

   String SURVEY_GET_AVGSCORE_BY_JOBID = "Survey_getAvgScoreByJobId";

   String SURVEY_GETBY_NAME_JOBID = "Survey_getByNameJobId";

   String SURVEY_GET_OLDPLANTOSTART = "Survey_getOldPlanToStart";

   String SURVEY_GET_PENDING_BY_PERIODID = "Survey_getPendingByPeriodId";

   String SURVEY_GETBY_NAME_JOBID2 = "Survey_getByNameJobId2";

   String SURVEY_GETSTARTBY_JOBID = "Survey_getStartByJobId";

   String SURVEY_GET_ACTIVE = "Survey_getActive";

   String SURVEY_GET_ALLPLANTOSTART = "Survey_getPlanToStart";

   String SURVEY_GET_STARTED = "Survey_getStarted";

   String SURVEY_GET_NEXTSURVEY = "Survey_getNextSurvey";

   String SURVEY_GET_STARTEDSCHEDULESURVEY = "Survey_getStartedScheduledSurvey";

   String SURVEY_GET_CANNOTVIEWRESULT_BY_JOBID = "Survey_getCannotViewResultByJobId";

   String SURVEY_GET_CANNOTVIEWRESULT_BY_SURVEYID = "Survey_getCannotViewResultBySurveyId";

   String SURVEY_EXIST_BY_PERIODID = "Survey_existByPeriodId";

   String SURVEYSETTING_GETBY_PROJECTID = "SurveySetting_getByProjectId";

   String SURVEYSETTING_GETBY_NAME = "SurveySetting_getByName";

   String SURVEYSETTING_GETBY_NAME2 = "SurveySetting_getByName2";

   String SURVEYSETTING_GETBY_NOTCOMPLETEJOB = "SurveySetting_getByNotCompleteJob";

   String SURVEYSETTING_ISRESP_BYJOBID = "SurveySetting_isRespByJobId";

   String SURVEYSETTING_ISRESP_BYPERIODID = "SurveySetting_isRespByPeriodId";

   String SURVEYPERIODQUESTION_GETBY_PERIODID = "SurveyPeriodQuestion_getByPeriodId";
   
   String SURVEYPERIODQUESTION_GETBY_PERIODID_ACTIVE = "SurveyPeriodQuestion_getByPeriodId_active";

   String SURVEYPERIODQUESTION_GETBY_PERIODID_TYPEID = "SurveyPeriodQuestion_getByPeriodIdTypeId";

   String SURVEYPERIODQUESTION_GETBY_QUESTIONID = "SurveyPeriodQuestion_getByQuestionId";

   String SURVEYPERIODQUESTION_GET_MAXORD = "SurveyPeriodQuestion_getMaxOrd";

   String SURVEYMEMBER_GETBY_SURVEYID = "SurveyMember_getBySurveyId";

   String SURVEYMEMBER_GET_RESP_BY_SURVEYID = "SurveyMember_getRespBySurveyId";

   String SURVEYMEMBER_IS_RESP = "SurveyMember_isResp";

   String SURVEYMEMBER_IS_VIEWRESULT = "SurveyMember_isViewResult";

   String SURVEYMEMBER_GET_VIEWRESULT = "SurveyMember_getViewResult";

   String SURVEYMEMBER_GET_ACTOR_BY_USER = "SurveyMember_getActorByUser";

   String SURVEYMEMBER_GET_ACTOR_BY_PARTY = "SurveyMember_getActorByParty";

   String SURVEYMEMBER_GET_ACTOR_BY_COMPANY = "SurveyMember_getActorByCompany";

   String SURVEYMEMBER_IS_ACTOR = "SurveyMember_isActor";

   String SURVEYMEMBER_IS_ACTOR2 = "SurveyMember_isActor2";

   String SURVEYMEMBER_IS_MANDATORYACTOR = "SurveyMember_isMandatoryActor";

   String SURVEYQUESTION_GETBY_QUESTIONID = "SurveyQuestion_getByQuestionId";

   String SURVEYQUESTION_GETBY_PENDINGQUESTIONID = "SurveyQuestion_getByPendingQuestionId";

   String SURVEYQUESTION_GET_MAXORD = "SurveyQuestion_getMaxOrd";

   String SURVEYQUESTION_GETBY_SURVEYID = "SurveyQuestion_getBySurveyId";

   String SURVEYQUESTION_GETBY_SURVEYID_TYPEID = "SurveyQuestion_getBySurveyIdTypeId";

   String SURVEYQUESTION_CHECKBY_QUESTIONID = "SurveyQuestion_checkByQuestionId";

   String SURVEYQUESTIONTYPE_GETBY_SURVEYIDANDTYPEID = "SurveyQuestionType_getBySurveyIdAndTypeId";

   String SURVEYUSER_GETBY_SURVEYID = "SurveyUser_getBySurveyId";

   String SURVEYUSER_GETBY_SURVEYID_COMPANYID = "SurveyUser_getBySurveyIdCompanyId";

   String SURVEYUSER_GET_UNANSWERED_BYSURVEYID = "SurveyUser_getUnansweredBySurveyId";

   String SURVEYUSER_GET_UNANSWERED_BYSURVEYID2 = "SurveyUser_getUnansweredBySurveyId2";

   String SURVEYUSER_GET_JOBANDSURVEYRESP = "SurveyUser_getJobAndSurveyResp";

   String SURVEYUSER_GET_UNANSWERED_MANDATORY_BYSURVEYID = "SurveyUser_getUnansweredMandatoryBySurveyId";

   String SURVEYUSER_GET_UNANSWERED_NONMANDATORY_BYSURVEYID = "SurveyUser_getUnansweredNonMandatoryBySurveyId";

   String SURVEYUSER_GET_UNANSWERED_NONMANDATORY_BYSURVEYID2 = "SurveyUser_getUnansweredNonMandatoryBySurveyId2";

   String SURVEYSETTINGMEMBER_GETBY_PERIODID = "SurveySettingMember_getByPeriodId";

   String QUESTIONANSWER_GET_ONEANSWER = "QuestionAnswer_getOneAnswer";

   String QUESTIONANSWER_GET_ONEANSWER2 = "QuestionAnswer_getOneAnswer2";

   String QUESTIONANSWER_GET_ANSWERLIST = "QuestionAnswer_getAnswerList";

   String QUESTIONANSWER_GET_ANSWERLIST2 = "QuestionAnswer_getAnswerList2";

   String QUESTIONANSWER_GET_TEXTANSWERLIST = "QuestionAnswer_getTextAnswerList";

   String QUESTIONANSWER_GET_TEXTANSWERLIST2 = "QuestionAnswer_getTextAnswerList2";

   String QUESTIONANSWER_GET_SUM_WITHQUESTION = "QuestionAnswer_getSumByScaleQuestion";

   String QUESTIONANSWER_GET_SUM_WITHQUESTION_AVG = "QuestionAnswer_getSumByNumberQuestionAvg";

   String QUESTIONANSWER_GET_SUM_WITHQUESTION_SUM = "QuestionAnswer_getSumByNumberQuestionSum";

   String QUESTIONANSWER_GET_MAX_WITHQUESTION = "QuestionAnswer_getMaxByNumberQuestion";

   String QUESTIONANSWER_GET_MIN_WITHQUESTION = "QuestionAnswer_getMinByNumberQuestion";

   String QUESTIONANSWER_GET_QUESTION_AVGSCORE_BY_SURVEYID = "QuestionAnswer_getQuestionAvgScoreBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTION_AVGSCORE_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionAvgScoreBySurveyIdCompanyId";

   String QUESTIONANSWER_GET_QUESTION_SUMCOUNT_BY_SURVEYID = "QuestionAnswer_getQuestionSumCountBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTION_SUMCOUNT_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionSumCountBySurveyIdCompanyId";
   
   String QUESTIONANSWER_GET_QUESTION_MAXCOUNT_BY_SURVEYID = "QuestionAnswer_getQuestionMaxCountBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTION_MAXCOUNT_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionMaxCountBySurveyIdCompanyId";
   
   String QUESTIONANSWER_GET_QUESTION_MINCOUNT_BY_SURVEYID = "QuestionAnswer_getQuestionMinCountBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTION_MINCOUNT_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionMinCountBySurveyIdCompanyId";
   
   String QUESTIONANSWER_GET_QUESTION_AVGCOUNT_BY_SURVEYID = "QuestionAnswer_getQuestionAvgCountBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTION_AVGCOUNT_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionAvgCountBySurveyIdCompanyId";
   
   String QUESTIONANSWER_GET_QUESTION_AVGLIST_BY_SURVEYID = "QuestionAnswer_getQuestionAvgListBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTION_AVGLIST_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionAvgListBySurveyIdCompanyId";
   
   String QUESTIONANSWER_GET_QUESTIONTYPE_AVGSCORE_BY_SURVEYID = "QuestionAnswer_getQuestionTypeAvgScoreBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTIONTYPE_AVGSCORE_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionTypeAvgScoreBySurveyIdCompanyId";

   String QUESTIONANSWER_GET_QUESTIONTYPE_AVGCOUNT_BY_SURVEYID = "QuestionAnswer_getQuestionTypeAvgCountBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTIONTYPE_AVGCOUNT_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionTypeAvgCountBySurveyIdCompanyId";
   
   String QUESTIONANSWER_GET_QUESTIONTYPE_AVGLIST_BY_SURVEYID = "QuestionAnswer_getQuestionTypeAvgListBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTIONTYPE_AVGLIST_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionTypeAvgListBySurveyIdCompanyId";
   
   String QUESTIONANSWER_GET_QUESTIONTYPE_SUMCOUNT_BY_SURVEYID = "QuestionAnswer_getQuestionTypeSumCountBySurveyId";
   
   String QUESTIONANSWER_GET_QUESTIONTYPE_SUMCOUNT_BY_SURVEYID_COMPANYID = "QuestionAnswer_getQuestionTypeSumCountBySurveyIdCompanyId";

   String QUESTIONANSWER_GET_COUNTOFNA = "QuestionAnswer_getCountOfNAByScaleQuestion";

   String QUESTIONANSWER_GETBY_SCALE = "QuestionAnswer_getByScale";

   String QUESTIONANSWER_GETBY_SCALEANDTYPE = "QuestionAnswer_getByScaleAndType";

   String QUESTIONANSWER_GETBY_NUMBER = "QuestionAnswer_getByNumber";

   String QUESTIONANSWER_GETBY_NUMBERANDTYPE = "QuestionAnswer_getByNumberAndType";

   String QUESTIONANSWER_GETBY_DATE = "QuestionAnswer_getByDate";

   String QUESTIONANSWER_GETBY_DATEANDTYPE = "QuestionAnswer_getByDateAndType";

   String QUESTIONANSWER_GETBY_TEXT = "QuestionAnswer_getByText";

   String QUESTIONANSWER_GETBY_TEXTANDTYPE = "QuestionAnswer_getByTextAndType";

   String QUESTIONTYPE_GET_ALL = "QuestionType_getAll";

   String QUESTIONTYPE_GETBY_JOBID = "QuestionType_getByJobId";

   String QUESTIONTYPE_GETBY_SURVEYID = "QuestionType_getBySurveyId";

   String QUESTIONTYPE_GETBY_NAME = "QuestionType_getByName";

   String QUESTIONTYPE_GETBY_NAME2 = "QuestionType_getByName2";

   String STRATEGY_GET_ALL = "Strategy_getAll";

   String STRATEGY_GETBY_NAME = "Strategy_getByName";

   String STRATEGY_GETBY_NAME2 = "Strategy_getByName2";

   String STRATEGYJOB_GETBY_JOBID = "StrategyJob_getByJobId";

   String STRATEGYJOB_GETBY_STRATEGYID = "StrategyJob_getByStrategyId";

   String STRATEGYJOB_GET_ALL = "StrategyJob_getAll";

   String STRATEGYLOG_GETBY_STRATEGYID = "StrategyLog_getByStrategyId";

   String STRATEGYLOG_GET_COMMENT_BY_STRATEGYID = "StrategyLog_getCommentByStrategyId";

   String STRATEGYJOB_GET_JOB_NONSTRATEGY = "StrategyJob_getJobNonStrategy";

   String STRATEGYMEMBER_GETBY_STRATEGYID = "StrategyMember_getByStrategyId";

   String ISSUE_GETMEMBER_BYID = "Issue_getMembersById";

   String ISSUE_GETCHECKER_BYID = "Issue_getCheckerById";

   String ISSUE_GETACTIONMEMBER_BYID = "Issue_getActionMembersById";

   String ISSUE_MEMBERINVOLVEMENT = "Issue_memberInvolvement";

   String ISSUE_CHECKERSTATUS_ISMYPENDING = "Issuecheckerstatus_isMyPending";

   String ISSUE_ISPASSMEMBER = "Issue_IsPassMember";

   String ISSUE_GETISSUES = "Issue_getIssues";

   String ISSUE_GETRESPREASON = "Issue_getRespReason";

   String ISSUE_ISNAMEEXITS = "Issue_isNameExits";

   String ISSUEACTION_ISNAMEEXITS = "IssueAction_isNameExits";

   String ISSUEACTION_GETACTIONS = "IssueAction_getActions";

   String ISSUE_CURUSER_ISRESP = "IssueAction_curUserIsResp";

   String RISK_MITIGATION_MEMBER_GETBYMID = "RiskMitigationMember_getByMid";

   String RMTYPE_GET_ORDERBYNAME = "Rmtype_getAll_OrderbyName";

   String STRATEGYMEMBER_GET_ALL = "StrategyMember_getAll";

   String STRATEGYMEMBER_IS_RESP = "StrategyMember_isResp";

   String STRATEGYMEMBER_IS_RESP_BY_STRATEGYID = "StrategyMember_isRespByStrategyId";

   String STRATEGYMEMBER_GET_USER_BY_STRATEGYID = "StrategyMember_getUserByStrategyId";

   String PMOJOB_GET_COUNT_BY_PMOID = "PmoJob_getCountByPmoId";

   String PMOJOB_GET_PROJECTID_BY_PMOID = "PmoJob_getProjectIdByPmoId";

   String PMOLOG_GETBY_PMOID = "PmoLog_getByPmoId";

   String PMOLOG_GET_COMMENT_BY_PMOID = "PmoLog_getCommentByPmoId";

   String SCHEDULERTASKLOG_GETBY_TASK = "SchedulerTaskLog_getByTask";

   String COND_DELIVERABLE_SEARCH = "cond_deliverable_search";

   String COND_DELIVERY_SEARCH = "cond_delivery_search";

   String COND_LIBRARY_SEARCH = "cond_library_search";

   String COND_DEPEND_SEARCH = "cond_depend_search";

   int BTN_SAVE = 0;

   int BTN_CLOSE = 2;

   int BTN_CANCEL = 4;

   int SUMMARY_LEN = 50;

   String MESSAGE = "message";

   String COMMON_MESSAGE = "commonMessage";

   String ERRORMSGTOPARENT = "errorMessageToParent";

   String ERROR_BIZ = "error_biz";

   String PATCH_ID = "patchId";

   String CVS_LOGIN = "CVS_LOGIN";

   String ACL_ERROR = null;

   String RETURE_VALUE = "returnValue";

   String IS_ARRAY = "isArray";

   String IS_OBJECT = "isObject";

   String SUCCESS_PAGE = "successPage";

   String VIEWRIGHT = "viewRight";

   String BEGIN_NODE = "beginNode";

   Object SYN_ADD_ITEMVERSION = new Object();

   String DASH_EVERYLOGIN = "everyLoginDash";

   /**
    * MS Project file type
    */
   String MS_PROJECT_FILE_TYPE_MPX = "MS_PROJECT_MPX";

   String MS_PROJECT_FILE_TYPE_MSPDI = "MS_PROJECT_MSPDI";

   /**
    * DB dependent deadlock error code key.
    */
   String DB_DEADLOCK_ERROR_CODE = "db.deadlock.errCode";

   String DB_LOCK_TIMEOUT_ERROR_CODE = "db.lock.timeout.errCode";

   String DELIVERABLE_STATUS_OVERDUE = "overdue";

   String PARAMETOR_CHARECTER = "?";

   String BUDGET_SHOW_ESTIMATE = "BudgetShowEstimate";

   String BUDGET_SHOW_REDFLAG = "BudgetShowRedFlag";

   String BUDGET_READONLY = "BudgetReadOnly";

   String BUDGET_WITHLINK = "BudgetWithLink";

   String BUDGET_GET_SNAPSHOT_QUARTERS = "BudgetClassSnapshot_getRelatedQuarters";

   String BUDGET_GET_SNAPSHOT_QUARTERS_TOPLEVEL = "BudgetQuarterSnapshot_getTopLevelByObject";

   // String BUDGET_GET_PMRESERVE_BY_PROJECTID =
   // "Budget_getPMReserveByProjectId";
   String FROZENSTART_DATE = "frozenStartDate";

   String FROZENEND_DATE = "frozenEndDate";

   String FROZEN = "frozen";

   String APPROVAL_SUB_DETAIL = "ApprovalSubDetail";

   String APPROVAL_SETTING_SNAPSHOT = "ApprovalSettingSnapshot";

   String FROZEN_MEMBERS = "frozenMembers";

   String FROZEN_SUBACT = "frozenSubAct";

   String FROZEN_KEYRES_MEMBER = "FrozKeyRes";

   String FROZEN_RESP_MEMBER = "FrozenResp";

   String APPROVAL_SUBACT_ADD = "ApprovalSubActAdd";

   String APPROVAL_SUBACT_DELETE = "ApprovalSubActDelete";

   String APPROVAL_ALL_ACTS = "ApprovalAllActs";

   String RESOLUTION = "Resolution";

   String IMPLEMENT = "Implement";

   String DEFAULT = "Default";

   String EDIT_PARENT = "editParent";

   Integer COMMITMENT_PRIORITY_BRK_NOTFULFIL = Integer.valueOf(3);

   Integer COMMITMENT_PRIORITY_BRK_FULFIL = Integer.valueOf(2);

   Integer COMMITMENT_PRIORITY_NO_RESPONSE = Integer.valueOf(1);

   Integer COMMITMENT_PRIORITY_FULFIL = Integer.valueOf(0);

   String SERVICE_PROVIDER = "GT.SERVICE_PROVIDER";

   String JOB_MEMBERS_OF = "Job_getMembersOf";

   String JOB_MEMBERS_OF_NONVIP = "Job_getMembersOfExcludeVip";

   String JOB_MEMBERS_OF_ROOT = "Job_getMembersOf_root";

   String JOB_MEMBERS_OF_NONVIP_ROOT = "Job_getMembersOfExcludeVip_root";

   String JOB_MEMBERS_OF_PARENT = "Job_getMembersOf_parent";

   String JOB_MEMBERS_OF_NONVIP_PARENT = "Job_getMembersOfExcludeVip_parent";
   
   String OBJ_TYPE_SALES_PRICE = "SalesPrice";  //销售价格

   String JOB_RESP_MEMBERS_OF = "Job_getRespMembersOf";

   String JOB_RESP_MEMBERS_OF_NONVIP = "Job_getRespMembersOfExcludeVip";

   String JOB_RESP_MEMBERS_OF_ROOT = "Job_getRespMembersOf_root";

   String JOB_RESP_MEMBERS_OF_NONVIP_ROOT = "Job_getRespMembersOfExcludeVip_root";

   String JOB_RESP_MEMBERS_OF_PARENT = "Job_getRespMembersOf_parent";

   String JOB_RESP_MEMBERS_OF_NONVIP_PARENT = "Job_getRespMembersOfExcludeVip_parent";

   String JOB_MEMBERS = "Job_getMembers";

   String JOB_MEMBERS_BY_ROOT = "Job_getMembersByRoot";

   String JOB_MEMBERS_BY_ROOT2 = "Job_getMembersByRoot2";

   String ITEMUSER_BY_ROOT = "Item_getUsersByRoot";

   String JOBGROUP_BY_MEMBERTYPE_JOBID = "JobGroup_getByJobIdAndMemberType";

   String OBJDEPEND_DEPENDON_JOB_MULTI = "ObjDepend_getDependJobMap_multiJobId";

   String OBJDEPEND_DEPENDON_JOB_MULTI2 = "ObjDepend_getDependJobMap_multiJobId2";

   String OBJDEPEND_DEPENDON_JOB_MULTI_REVERSE = "ObjDepend_getDependJobMap_multiJobId_reverse";

   String OBJDEPEND_DEPENDON_JOB_MULTI2_REVERSE = "ObjDepend_getDependJobMap_multiJobId2_reverse";

   Integer COMMITMENT_INVALID_COMMITTEDTO_ERR_ID = Integer.valueOf(10000);

   Integer COMMITMENT_INVALID_APPROVER_ERR_ID = Integer.valueOf(10001);

   Object OBJ_TYPE_PRODUCTVERSIONMODULE = "ProductVersionModule";

   String OBJ_TYPE_CAMPAIGN_TYPE = "CampaignType";

   String OBJ_TYPE_OFFER_TYPE = "OfferType";

   String OBJ_TYPE_CONTENTTEMPLATE_TYPE = "ContentTType";

   String OBJ_TYPE_SEVERITY_TYPE = "Severity";

   String OBJ_TYPE_URGENCY_TYPE = "Urgency";

   String OBJ_TYPE_COMMUNICATION_METHOD = "Communication";

   String OBJ_TYPE_CAMPAIGN_TARGET = "CampaignTarget";

   String OBJ_TYPE_CAMPAIGN_TARGET2 = "CampaignTg";

   String OBJ_TYPE_PRODUCT = "Product";
   
   String OBJ_TYPE_PRODUCT_SHELF = "ProductShelf";

   String OBJ_TYPE_PRODUCT_O2O = "ProductO2O";
   
   String OBJ_TYPE_PRODUCT_O2O_MOBILE = "ProductO2OMobile";
   
   String OBJ_TYPE_CUSTOMIZE_PRODUCT = "CustomizePdt";
   
   String OBJ_TYPE_PRODUCT_SHOPCART = "PdtShopcart";
   
   String OBJ_TYPE_PRODUCT_ASSIGNMENT = "PdtAssignment";

   String OBJ_TYPE_PRODUCTTYPE = "ProductType";
   
   String OBJ_TYPE_PRODUCT_ICON = "ProductIcon";
   
   String OBJ_TYPE_TRAINING_SEGMENT_ITEM = "trainingSegItem";

   String OBJ_TYPE_TRAINING_SEGMENT_ELEARN_ITEM = "trainingSegEleItem";
   
   String OBJ_TYPE_BENEFITPLAN_ICON = "BenefitPlanIcon";

   String OBJ_TYPE_PRODUCTANDFAMILY = "ProdFam";

   String OBJ_TYPE_PRODUCT_FAMILY = "PdtFamily";
   
   String OBJ_TYPE_PRODUCT_SUBFAMILY = "PdtSubFamily";
   
   String OBJ_TYPE_PRODUCT_WORKSTAGE = "WorkStage";
   
   String OBJ_TYPE_PRODUCT_ROUTING = "Routing";
   
   String OBJ_TYPE_PRODUCT_LEADTIME = "LeadTime";
   
   String OBJ_TYPE_PRODUCT_ROUTING_MEMBER = "RoutingMember";

   String OBJ_TYPE_PRODUCT_RECEICED = "ProductReceived";
   
   String OBJ_TYPE_PRODUCT_RECEICED_ITEM = "ProductReceivedItem";
   
   String OBJ_TYPE_PRODUCT_DELIVERY = "ProductDelivery";
   
   String OBJ_TYPE_PRODUCT_DELIVERY_APPROVAL = "PdtDelivery";
   
   String OBJ_TYPE_PRODUCT_DELIVERY_ITEM = "ProductDeliveryItem";
   
   String OBJ_TYPE_PRODUCT_VERSION = "ProdVersion";

   String OBJ_TYPE_PRODUCT_LICENCE = "ProdLicen";

   String OBJ_TYPE_PRODUCT_INTERESTRATE = "ProdIntrType";

   String OBJ_TYPE_PROGRESS_REPORT_FILE = "ProgressReport";

   String OBJ_TYPE_COMPANY_FINANCIAL_SUM = "ClientFin";

   String OBJ_TYPE_COMPANY_FINANCIAL_SUM_CREDIT = "ClientFinCredit";

   String OBJ_TYPE_COMPANY_INTERACTION = "CompanyIntr";

   String OBJ_TYPE_COMPANY_REFERENCE = "CompanyRef";

   String OBJ_TYPE_COMPANY_QUOTATION = "CompanyQuot";

   String OBJ_TYPE_COMPANY_EXTEND_PAGE = "CompanyExt"; // company的自定义页面 type

   String OBJ_TYPE_PERFORMANCE_RATING = "PerRating";

   String OBJ_TYPE_PERFORMANCE_AREA = "PerArea";
   
   String OBJ_TYPE_PERLEVELRATING = "PerLevelRating";

   String OBJ_TYPE_COUNTRY = "Country";

   String OBJ_TYPE_STATE = "State";

   String OBJ_TYPE_CITY = "City";

   String OBJ_TYPE_EMAIL_SERVER = "EmailServer";

   String OBJ_TYPE_EMAIL_OPTOUT = "EmailOptOut";

   String OBJ_TYPE_EMAIL_HIST = "EmailHist";

   String OBJ_TYPE_STATEMENT_TEMPLATE = "StatementTemplate";

   String OBJ_TYPE_DRS_DURATION = "Duration";

   String OBJ_TYPE_DRS_BANDWIDTH = "Bandwidth";

   String OBJ_TYPE_DRS_CONTRACT_TYPE = "ContractType";
   
   String OBJ_TYPE_DRS_CLIENT_CONTRACT_TYPE = "ClientContractType";

   String OBJ_TYPE_DRS_ORDER_TYPE = "OrderType";
   
   String OBJ_TYPE_DRS_BIllING_RULE = "BillingRule";
   
   String OBJ_TYPE_DRS_PRICE_GROUP = "PriceGroup";
   
   String OBJ_TYPE_DRS_ITEM_CATEGORY = "ItemCategory";
   
   String OBJ_TYPE_DRS_PAYMENT_TERM ="PaymentTerm";

   String OBJ_TYPE_DRS_POP = "PointPresence";

   String OBJ_TYPE_DRS_BRANDNAME = "BrandName";
   
   String OBJ_TYPE_DRS_ORIGINNAME = "OriginName";

   String OBJ_TYPE_PORT = "Port";

   String OBJ_TYPE_RFI = "Rfi";

   String OBJ_TYPE_STANDOFFER = "StandOffer";
   
   String OBJ_TYPE_RFI_DOCUMENT = "RfiDocument";
   
   String OBJ_TYPE_RFI_NATURE = "RfiNature";
   
   String OBJ_TYPE_RFI_TEMPLATE = "RfiTemplate";
   
   String OBJ_TYPE_RFI_EXPERTROLE = "RfiExpertRole";
   
   String OBJ_TYPE_ANNOUNCEMENT = "Announcement";
   
   Integer ANNOUNCEMENT_TYPE_BRANCH_COMPANY = 100;
   Integer ANNOUNCEMENT_TYPE_ORGANIZATION_CHART = 200;
   Integer ANNOUNCEMENT_TYPE_TEAM_INTRODUCTION = 300;
   Integer ANNOUNCEMENT_TYPE_HISTORY = 400;

   String OBJ_TYPE_BULLETIN = "Bulletin";
   
   String OBJ_TYPE_COMMONGRADE = "CommonGrade";

   String OBJ_TYPE_OPENREQUEST = "OpenRequest";
   
   String OBJ_TYPE_RFIPARTISIPANT = "RfiPartcp";
   
   String OBJ_TYPE_RFIAUCTION = "RfiAuction";

   String OBJ_TYPE_RFIPREPARATION = "RfiPrepr";

   String OBJ_TYPE_RFIPREPARATIONFORREVIEWER = "RfiPreprRvw";

   String OBJ_TYPE_RFICOMPETITOR = "RfiCmptt";

   String OBJ_TYPE_FACILITY_EQUIPMENT = "fEquipment";

   String OBJ_TYPE_EQUIPMENT_REQUEST = "eqRequest";
   
   String OBJ_TYPE_EQUIPMENT_REQUEST_ITEM = "eqReqItem";
   
   String OBJ_TYPE_EQUIPMENT_SUBFACILITY = "eqSubfa";
   
   String OBJ_TYPE_EQUIPMENT_SUBFACILITY_HISTORY = "eqSubHist";
   
   String OBJ_TYPE_EQUIPMENT_SUBFACILITY_PERIOD = "eqPeriod";
   
   String OBJ_TYPE_EQUIPMENT_REQUEST_SUBMIT = "eqReqSubmit";

   String OBJ_TYPE_EQUIPMENT_TYPE = "EquipmentType";

   String OBJ_TYPE_EQUIPMENT_TYPE_SUB_FACILITY = "EquipmentTypeSubFacility";

   String FEEDBACK_GETBY_PK = "Feedback_getByPk";

   String FEEDBACK_GETBY_USER = "Feedback_getByUser";

   String COMMITMENT_GETCIBY_TYPE = "Commitment_getCIBy_Type";

   String CO_FILTER_ISUSED = "Filter_isUsedByTypeCO";

   String CO_POLICY_QUEUE_GET_ALL_USERS_BY_TYPE = "CoPolicyQueue_getAllUsersByType";

   int REPORTTOME_1ST_LEVEL = -10000000;

   int REPORTTOME_2ND_LEVEL = -20000000;

   int REPORTTOME_3RD_LEVEL = -30000000;

   String ISSUE_MEMBER_GROUP = "RespGroup";

   String ISSUE_MEMBER_RESP = "Resp";

   String ISSUE_MEMBER_RAISEBY = "RaisedBy";

   String ISSUE_MEMBER_RECEIVE = "Receive";

   String ISSUE_MEMBER_CLIENT = "Client";

   String CHECKER_STATUS_PENDING = "Pending";

   String CHECKER_STATUS_FAIL = "Fail";

   String CHECKER_STATUS_PASS = "Pass";

   String ISSUE_DETUSER_BYID = "Issue_getUserById";

   String ISSUEMEMBER_GETBY_INVOLVEMENT = "Issuemember_getByInvolvement";

   String ISSUEMEMBER_GETBY_ASSOCIATE = "Issuemember_getByAssociate";

   String ISSUEASSOCIATE_GET_OTHER = "Issueassociate_getOther";

   String ISSUEASSOCIATE_GET_PRIMARY = "Issueassociate_getPrimary";

   String ACTION_GET_RESP = "IssueAction_getActionResp";

   Integer FUNCTION_RIGHT_PROJ_EDIT = 16;

   Integer FUNCTION_RIGHT_PROJ_READ = 15;

   String SHOW_CONFIRM_POPUP = "showConfirmPopup";

   String ERR_EXCEED_MAX_UPLOAD_SIZE = "error.upload.exceedSystemUploadSize";

   String ISSUE_CANPROJDEL = "Issue_canProjDel";

   String ISSUE_CANDELDELETE = "Issue_canDelDelete";

   String ISSUE_CANDEPDELETE = "Issue_canDepDelete";

   String ISSUE_CANRISKDELETE = "Issue_canRiskDelete";

   String ISSUE_DELPROJ = "Issue_delProj";

   String ISSUE_DELJOB = "Issue_delJob";

   String ISSUE_DELDEL = "Issue_delDel";

   String ISSUE_DELDEP = "Issue_delDep";

   String ISSUE_DELCO = "Issue_delCO";

   String ISSUE_DELRISK = "Issue_delRisk";

   String ISSUE_GETDELJOBID = "Issue_getDelJobId";

   String ISSUE_GETDEPJOBID = "Issue_getDepJobId";

   String ISSUE_CANCODEL = "Issue_canCODelete";

   String ISSUE_ISACCEPTED = "Issue_isAccepted";

   String ISSUE_GETMYISSUEIDS = "Issue_getMyIssueIds";

   String ISSUE_GETJOBBYISSUEID = "Issue_getJobByIssueId";

   String ISSUE_GETPMOBYISSUEID = "Issue_getPmoByIssueId";

   String ISSUE_GETSTRATEGYBYISSUEID = "Issue_getStrategyByIssueId";

   String SESSION_WORK_DOC_LIST = "8thManage.session.workDoc.list";

   String SESSION_JOB_LIST = "8thManage.session.job.list";

   String SESSION_INTERVIEW_LIST = "8thManage.session.interivew.list";

   String SESSION_REQUISITION_LIST = "8thManage.session.requisition.list";

   String SESSION_EQUIPMENT_REQUEST_LIST = "8thManage.session.equipmentRequest.list";

   String SESSION_JOB_TREE = "8thManage.session.job.tree";

   String SESSION_STRATEGY_SEARCH_TYPE = "8thManage.session.strategySearchType";

   String SESSION_CLIENT_OPPOR_LIST = "8thManage.session.clientOppor.list";

   String SESSION_SUPPLIER_OPPOR_LIST = "8thManage.session.supplierOppor.list";

   String SESSION_INTERNAL_OPPOR_LIST = "8thManage.session.internalOppor.list";

   String SESSION_CLIENT_DEAL_LIST = "8thManage.session.clientDeal.list";

   String SESSION_SUPPLIER_DEAL_LIST = "8thManage.session.supplierDeal.list";

   String SESSION_CAMPAIGN_LIST = "8thManage.session.campaign.list";

   String SESSION_CLIENT_ORDER_LIST = "8thManage.session.clientOrder.list";

   String SESSION_CLIENT_RETURN_LIST = "8thManage.session.clientReturn.list";

   String SESSION_SUPPLIER_ORDER_LIST = "8thManage.session.supplierOrder.list";

   String SESSION_AGENT_ORDER_LIST = "8thManage.session.agentOrder.list";

   String SESSION_GROUP_ORDER_LIST = "8thManage.session.groupOrder.list";

   String SESSION_CLIENT_ORDER_TRACKING_LIST = "8thManage.session.ClientOrderTracking.list";
   
   String SESSION_COURSE_LIST = "8thManage.session.course.list";

   String ISSUE_GETJOBRESP = "Issue_getJobResp";

   String ISSUE_GETITEMRESP = "Issue_getItemResp";

   String ISSUE_GETRISKRESP = "Issue_getRiskResp";

   String INVOICE_GETBY_COMPANYID = "Invoice_getByCompanyId";

   String INVOICE_GET_APPROVER_BY_INVOICEID = "Invoice_getApproverByInvoiceId";

   String INVOICE_GET_LASTDATE_BY_COMPANYID = "Invoice_getLastDateByCompanyId";

   String INVOICE_IS_DUPLICATE = "Invoice_isDuplicate";

   String INVOICELISTING_GETBY_INVOICEID = "InvoiceListing_getByInvoiceId";

   String INVOICELISTING_GETBY_ITEMTYPE = "InvoiceListing_getByItemType";

   String INVOICELISTING_GROUPBY_PROJECT = "InvoiceListing_groupByProject";

   String INVOICELISTING_GROUPBY_ACTIVITY = "InvoiceListing_groupByActivity";

   String INVOICELISTING_GROUPBY_RESOURCE = "InvoiceListing_groupbyResource";

   String INVOICELISTING_GROUPBY_PROJECT2 = "InvoiceListing_groupByProject2";

   String INVOICELISTING_GROUPBY_MATERIAL = "InvoiceListing_groupByMaterial";

   String INVOICELISTING_GROUPBY_TE = "InvoiceListing_groupByTE";

   String INVOICELISTING_GROUPBY_PROJECT3 = "InvoiceListing_groupByProject3";

   String INVOICELISTING_GROUPBY_ACTIVITY3 = "InvoiceListing_groupByActivity3";

   String INVOICELISTING_GROUPBY_ITEMTYPE = "InvoiceListing_groupbyItemType";

   String INVOICELISTING_GETBY_RESOURCENAME = "InvoiceListing_getResourceName";

   String INVOICELISTING_GETBY_RESOURCENAME2 = "InvoiceListing_getResourceName2";

   String INVOICELISTING_GETBY_MATERIALNAME = "InvoiceListing_getMaterialName";

   String INVOICELISTGROUP_GETBY_INVOICEID = "InvoiceListGroup_getByInvoiceId";

   String PAYMENTINVOICE_GET_COUNT_BY_INVOICEID = "PaymentInvoice_getCountByInvoiceId";

   String PAYMENTINVOICE_GETBY_INVOICEID = "PaymentInvoice_getByInvoiceId";

   String DB_TYPE = "db.type";

   String DB_TYPE_MSSQL = "MSSQL";

   String DB_TYPE_ORACLE = "Oracle";

   String SIMPLE_VIEW = "simpleView";

   String ICON_VIEW = "iconView";

   String PARAM_FROM_ORG_CHART = "isFromOrgChart";

   String EDIT_LINK = "isForEdit";

   // for license
   String TYPE_ALL = "All";

   int PROJECT_CODE_LENGTH = 64;

   int SQL_INSTATEMENT_MAXROWCOUNT = 999;

   int SQLSERVER_INSTATEMENT_MAXROWCOUNT = 19999;

   String LICENSE_TYPE_PM_PLUS = "PM+";

   String BSE_LICENSE_TYPE_PM_PLUS = "BSE";

   String LICENSE_TYPE_PM = "PM";

   String LICENSE_TYPE_PMO = "PMO";

   String LICENSE_TYPE_BIS = "BIS";

   String LICENSE_TYPE_BIS_ENT = "BIS_ENT";

   String LICENSE_TYPE_BIS_BN = "BIS_BN";

   String LICENSE_TYPE_BMO = "BMO";

   String LICENSE_TYPE_BMO_ENT = "BMO_ENT";

   String LICENSE_TYPE_BMO_BN = "BMO_BN";

   Integer OBJ_ID_USER = 10;

   Integer OBJ_ID_PARTY = 20;

   Integer OBJ_ID_COMPANY = 30;

   Integer OBJ_ID_JOB = 100;

   Integer OBJ_ID_ITEM = 200;

   Integer OBJ_ID_DELIVERABLE_FULL = 300;

   Integer OBJ_ID_ITEM_CHECK = 400;

   Integer OBJ_ID_ITEM_ACCEPT = 500;

   Integer OBJ_ID_CO = 600;

   Integer OBJ_ID_DOCUMENT = 700;

   Integer OBJ_ID_DOCUMENT_TYPE = 720;

   Integer OBJ_ID_WORKDOC = 750;

   Integer OBJ_ID_FIELD = 800;

   Integer OBJ_ID_COMMITMENT = 900;

   Integer OBJ_ID_GROUP = 1000;

   Integer OBJ_ID_APPROVAL = 1100;

   Integer OBJ_ID_COMMENT = 1200;

   Integer OBJ_ID_PROJECT = 1300;

   Integer OBJ_ID_FILTER = 1400;

   Integer OBJ_ID_ACTIVITY = 1500;

   Integer OBJ_ID_PATCH = 1600;

   Integer OBJ_ID_DELIVERABLE = 1700;

   Integer OBJ_ID_DEPENDENCY = 1800;

   Integer OBJ_ID_DEPENDENCY_FULL = 1900;

   Integer OBJ_ID_OBJDEPEND = 2000;

   Integer OBJ_ID_REQUIREMENT = 2100;

   Integer OBJ_ID_RESOURCESALLOCATE = 2200;

   Integer OBJ_ID_RES_ALLOCATE = 2300;

   Integer OBJ_ID_RESPUSER = 2400;

   Integer OBJ_ID_RESPPARTY = 2500;

   Integer OBJ_ID_BUDGET = 2600;

   Integer OBJ_ID_BUDGET_ACTUAL = 2700;

   Integer OBJ_ID_STRATEGY = 2800;

   Integer OBJ_ID_ISSUE = 2900;

   Integer OBJ_ID_TIMESHEETPERIOD = 3000;

   Integer OBJ_ID_TIMESHEETSUBMIT = 3010;

   Integer OBJ_ID_BUDGETJOB = 3100;

   Integer OBJ_ID_BUDGETCLS = 3200;

   Integer OBJ_ID_DELIVERY = 3300;

   Integer OBJ_ID_COMPANY_PROD_LIC = 3400;

   Integer OBJ_ID_RES = 3400;

   Integer OBJ_ID_KEYRES = 3500;

   Integer OBJ_ID_RISK = 3600;

   Integer OBJ_ID_RISK_MITIGATION = 3700;

   Integer OBJ_ID_SURVEY = 3800;

   Integer OBJ_ID_DISCUSSION = 3900;

   Integer OBJ_ID_PRODUCTVERSIONMODULE = 4000;

   Integer OBJ_ID_PMO = 4100;

   Integer OBJ_ID_PMO2 = 4200;

   Integer OBJ_ID_PRODUCT = 4300;

   Integer OBJ_ID_TITLE = 4400;

   Integer OBJ_ID_LEVEL = 4500;

   Integer OBJ_ID_TYPE = 4600;

   Integer OBJ_ID_SHIPMENT = 4700;

   Integer OBJ_ID_BASICRISKCRITERION = 4800;

   Integer OBJ_ID_RISKCRITERION = 4900;

   Integer OBJ_ID_RISKANALYSIS = 5000;

   Integer OBJ_ID_SELECTIONSUPPLIER = 5100;

   Integer OBJ_ID_SELECTIONCRITERION = 5200;

   Integer OBJ_ID_SELECTIONROUND = 5300;

   Integer OBJ_ID_SELECTIONRATING = 5400;

   String SETTING_MARK = "setting_mark";

   String DELEGATE_USER = "delegate user";

   Integer PROJECT_VIEW_BASIC = -5;

   String CLUSTER_XML_CHARSET = "UTF-8";

   int CLUSTER_XML_INDENT = 4;

   String DATASOURCE = "java:comp/env/jdbc/iManage";

   String ATTR_KEY_HIDDEN_COMPANY_ID = "hiddenCompanyId";

   String PRODUCT_LICENSE_NO_PRE = "L";

   String INVOICENO_PRE = "C";

   String ORDERNO_PRE = "OA";

   String QUOTATIONNO_PRE = "QA";
   
   String QUOTATION_SHIPMENTNO_PRE = "SD";
   
   String TRAINING_SEGMENT_PRE = "TS";
   
   String TRAINING_PRE = "TR";

   String RETURNNO_PRE = "RA";

   String STRATEGYNO_PRE = "S";

   String DEALNO_PRE = "D";

   String CAMPAIGN_PRE = "CP";

   String PAYMENTNO_PRE = "P";

   String EXPENSE_REPORT_NO_PRE = "R";

   String EXPENSE_ADVANCE_NO_PRE = "A";

   String EXPENSE_TVISA_NO_PRE = "T";

   String COMPANY_NO_PRE = "C";

   int OBJNO_GROUP_LENGTH = 6;

   int OBJNO_MIN_LENGTH = 6;

   /**
    * Approval 的step结构对象，每个step中有user和predecessor
    */
   String APPROVAL_CHAIN = "approvalChain";

   String RETURN_VALUE_KEY = "returnValueKey";

   String AUDITTRAIL_FILTER_ALL = "All";

   String AUDITTRAIL_FILTER_MODIFICATION = "Modification";

   String AUDITTRAIL_FILTER_SUBMISSION = "Submission";
   String AUDITTRAIL_FILTER_TRACK = "Track";

   String AUDITTRAIL_FILTER_COMMENT = "Comment";

   String AUDITTRAIL_FILTER_APPROVAL = "Approval";

   /* CROSS_BROWSER_CHANGES_BEGIN */
   String BROWSER_TYPE_IE = "IE";

   String BROWSER_TYPE_FIREFOX = "Firefox";

   String BROWSER_TYPE_CHROME = "Chrome";
   
   String BROWSER_TYPE_SAFARI = "Safari";
   
   String BROWSER_TYPE_MAC_SAFARI = "MacSafari";
   
   String BROWSER_TYPE_MOBILE_SAFARI = "MobileSafari";
   
   String BROWSER_TYPE_MOBILE_CHROME = "MobileChrome";
   
   String BROWSER_TYPE_OTHERS = "Others";

   /* CROSS_BROWSER_CHANGES_END */

   String SURVEY_TYPE_JOB = "JOB";

   String SURVEY_TYPE_STRATEGY = "STRATEGY";

   String SURVEY_TYPE_CAMPAIGN = OBJ_TYPE_CAMPAIGN;

   String SURVEY_TYPE_ENTERPRISE = "ENTERPRISE";

   String SURVEY_TYPE_AGENDA = "AGENDA";
   
   String SURVEY_TYPE_COMPANY = "COMPANY";
   
   String SURVEY_TYPE_TRAINING = "TRAINING";

   String SURVEY_TYPE_GROUP = "GROUP";
   
   String SURVEY_TYPE_RFI = "RFI";
   
   String SURVEY_TYPE_ASSESSMENT = "ASSESSMENT";
   
   String DURATION_UNIT_D = "d";

   String DURATION_UNIT_H = "h";

   String DURATION_UNIT_M = "m";

   /* 表格翻页的页码标识 */
   String PAGINATION_FLAG_PAGINATING = "isPaginating";

   String PAGINATION_FLAG_NO_NEED = "noNeedPagination";

   String TYPE_PAGE_NO_ADMIN_RESTYPE = "admin.ResourceTypes.pageNo";

   String TYPE_PAGE_NO_ADMIN_ROLES = "admin.Roles.pageNo";

   String TYPE_PAGE_NO_ADMIN_CR = "admin.ChangeRates.pageNo";

   String TYPE_PAGE_NO_ADMIN_SALESTAXRATES = "admin.SalesTaxRates.pageNo";

   String ATTACH_TYPE_PROJSCOPE = "ProjScope";

   String ATTACH_TYPE_LEGALDOC = "LegalDoc";

   String ATTACH_TYPE_LEGALDOC_STRATEGY = "LegDocStra";

   String ATTACH_TYPE_LEGALDOC_PMO = "LegDocPmo";

   String ATTACH_TYPE_RFIDOC = "RfiDoc";

   String ATTACH_TYPE_RFIPRPDOC = "RfiPrpDoc";

   String ATTACH_TYPE_RFIRSPDOC = "RfiRspDoc";

   String ATTACH_TYPE_RFIEVLDOC = "RfiEvlDoc";

   String ATTACH_TYPE_RFIRCMDOC = "RfiRcmDoc";
   
   String ATTACH_TYPE_PAY_CERTIFICATE = "RfiPayCertif";

   String ERRPAGE_NO_TOPLINE = "errorPageWithoutTopLine";

   String PROJECT_ATTENTION_WARNING_TYPE_ONE = "1";

   String PROJECT_ATTENTION_WARNING_TYPE_TWO = "2";

   String PROJECT_ATTENTION_WARNING_TYPE_THREE = "3";

   String PROJECT_ATTENTION_WARNING_TYPE_FOUR = "4";

   String ADMIN_MEASUREMENT_TYPE_TARGET = "targetType";

   String ADMIN_MEASUREMENT_TYPE_REWARD = "rewardType";

   String ADMIN_MEASUREMENT_TYPE_PENALTY = "penaltyType";

   String ADMIN_MEASUREMENT_TYPE_MEASURE = "measurementType";

   String ADMIN_PERFORMANCE_OBJECTIVE_TYPE_MEASURE = "performanceMeasureType";

   String ADMIN_MEASUREMENT_TYPE_MEASURE_SELECT = "measurementTypeSelect";

   String ADMIN_SLA_TYPE_FLAG = "slaType";

   String ENTERPRISE = "ENTERPRISE";

   String DEFINE = "DEFINE";

   String RATEID = "RATEID";

   String REQ_ACTION_NAME = "_gearActionName";

   String REQ_METHOD_NAME = "_gearMethodName";
   
   String PARAM_RETURN_ANCHOR = "gearReturnAnchor";
   
   String SESSION_RETURN_ANCHOR = "_gearReturnAnchor";

   String PRODUCT = "product";

   String SESSION_REMOVED_FLAG = "wisageTechSessionRemoved";

   String MILESTONE = "milestone";

   String NO_ROLE = "noroles";

   String RED = "RED";

   String YELLOW = "YELLOW";

   String GREEN = "GREEN";

   String GRAY = "GRAY";

   String WHITE = "WHITE";

   String BOOLEAN_TRUE = "true";

   String MORE_AFFIX = ", ......";

   String PROJECT_TREE_MAP_EV_LCM = "projectTreeMapEVLCM";

   String PROJECT_TREE_MAP_EV_LCMD = "projectTreeMapEVLCMD";

   String PROJECT_TREE_MAP_EV_CM = "projectTreeMapEVCM";

   String PROJECT_TREE_MAP_EV_CMD = "projectTreeMapEVCMD";

   String PROJECT_TREE_MAP_EV_SUBMIT_PERCENT = "projectTreeMapEVSubmitPercent";

   String PROJECT_TREE_MAP_EV_ACCEP_PERCENT = "projectTreeMapEVAccepPercent";

   String PROJECT_TREE_MAP_DATECALENDAR = "projectTreeMapDateCalendar";

   int MAX_LEN_SQL_IN = 800;

   String IS_AJAX = "isAjax";

   String COCOMMIMENT = "CoCommitment";

   String GENERAL_AUTHORITY_MATRIX = "generalAuthorityMatrix";

   String CLNT_BUSS_AUTHORITY_MATRIX = "clntBussAuthorityMatrix";

   String SUPP_BUSS_AUTHORITY_MATRIX = "suppBussAuthorityMatrix";

   String INTER_PRO_AUTHORITY_MATRIX = "interProAuthorityMatrix";

   String GROUP_TYPE_GENERAL = "General";

   String GROUP_TYPE_CLIENT = "Client";
   
   String GROUP_TYPE_SUPPLIERPREQUA = "Supp";

   String GROUP_TYPE_LICENSEEXPIRE = "LicenseExpiry";

   String GROUP_TYPE_AGENT = "Agent";

   String GROUP_TYPE_SUPPLIER = "Supplier";

   String GROUP_TYPE_COMPETITOR = "Competitor";

   String GROUP_TYPE_OTHER = "Others";

   String GROUP_TYPE_INTER_PRG = "InterPrg";

   String GROUP_TYPE_INTER_DOC = "Document";

   String GROUP_TYPE_INTER_PROJECT_DELIVERABLE_TYPE = "ProjDeliType";
   
   String GROUP_TYPE_INTER_PROJECT_TYPE = "ProjType";

   String GROUP_TYPE_INTER_PROJECT_REQUEST_TYPE = "ProjReqType";

   String GROUP_TYPE_INTER_PROJECT_STATUS_CHANGE_TYPE = "ProjStaType";

   String GROUP_TYPE_EQUIMENT_TYPE = "EquimtType";

   String GROUP_TYPE_INTER_LEAVE = "Leave";
   
   String GROUP_TYPE_CO = "CO";

   String GROUP_TYPE_INTER_CUSTOM_FORM_TYPE = "CustFormType";

   String GROUP_TYPE_TRAIN = "Training";
   
   String GROUP_TYPE_TRAIN_PLAN_TYPE = "TrainPlanType";

   String GROUP_TYPE_COURSEWARE = "Courseware";

   String GROUP_TYPE_HR = "HR";
   
   String GROUP_TYPE_STOCKCHECT = "StockCheck"; // 产品库存盘点
   String GROUP_TYPE_MEMBERSHIP = "Membership";

   String AJAX_MATCHUSER_USERTYPE_NONLOGIN_APPROVER = "nonLoginApprover";

   String AJAX_MATCHUSER_USERTYPE_NONLOGIN_APPROVER2 = "nonLoginApprover2";

   String AJAX_MATCHUSER_USERTYPE_NONLOGIN_COMMITTEDBY = "nonLoginCommittedBy";

   String AJAX_MATCHUSER_USERTYPE_NONLOGIN_COMMITTEDTO = "nonLoginCommittedTo";

   String AJAX_MATCHUSER_USERTYPE_NONLOGIN_REVIEWER = "nonLoginReviewer";

   String AJAX_MATCHUSER_USERTYPE_NONLOGIN_ACCEPTINGPERSON = "nonLoginAcptPerson";

   String AJAX_MATCHUSER_APPROVALTYPE_USERDEFINED = "userDefined";

   String AJAX_MATCHUSER_APPROVALTYPE_APPROVALLIST = "approvalList";

   String AJAX_MATCH_TYPE = "matchType";

   String AJAX_MATCHCOMPANY_MATCHTYPE_APPROVALLIST = "defaultApprovalList";

   String PROJ_VIEWTYPE_MYSELF = "Myself";

   String PROJ_VIEWTYPE_MYSELF_AND_OFFSPRING = "MyselfAndOffspring";

   String EQUIPMENT_ACCEPTANCETYPE_RECEIVE = "Receive";

   String EQUIPMENT_ACCEPTANCETYPE_RETURN = "Return";

   String EQUIPMENT_ACCEPTANCETYPE_REJECT = "Reject";

   String MODULE_NAME_DAILYREMINDER = "DailyReminder";

   String ADMIN_CONFIG_SHOW_CLIENT_OPP_ANALAYSIS = "ShowClientOppAnalaysis";

   String ADMIN_CONFIG_SHOW_CLIENT_OPP_CR = "ShowClientOppCR";

   String ADMIN_CONFIG_SHOW_CLIENT_OPP_SCOPDOC = "ShowClientOppScopDoc";

   String ADMIN_CONFIG_SHOW_CLIENT_OPP_LEG = "ShowClientOppLeg";

   String ADMIN_CONFIG_SHOW_CLIENT_OPP_BOM = "ShowClientOppBom";

   String ADMIN_CONFIG_SHOW_SUP_OPP_CR = "ShowSupOppCR";

   String ADMIN_CONFIG_SHOW_SUP_OPP_SCOPDOC = "ShowSupOppScopDoc";

   String ADMIN_CONFIG_SHOW_SUP_OPP_LEG = "ShowSupOppLeg";

   String ADMIN_CONFIG_SHOW_INTER_OPP_FINALAPPR = "ShowInterOppFinalAppr";

   String ADMIN_CONFIG_SHOW_INTER_OPP_CR = "ShowInterOppCR";

   String ADMIN_CONFIG_SHOW_INTER_OPP_SCOPDOC = "ShowInterOppScopDoc";

   String ADMIN_CONFIG_SHOW_INTER_OPP_LEG = "ShowInterOppLeg";

   String ADMIN_CONFIG_SHOW_CAMPAIGN_CR = "ShowCampaignCR";

   String ADMIN_CONFIG_SHOW_CAMPAIGN_SCOPDOC = "ShowCampaignScopDoc";

   String ADMIN_CONFIG_SHOW_CAMPAIGN_LEG = "ShowCampaignLeg";

   String ADMIN_CONFIG_SHOW_CLIENT_CONTRACT_BOM = "ShowClientContractBom";

   String ADMIN_CONFIG_SHOW_CLIENT_CONTRACT_CR = "ShowClientContractCR";

   String ADMIN_CONFIG_SHOW_CLIENT_CONTRACT_SCOPDOC = "ShowClientContractScopDoc";

   String ADMIN_CONFIG_SHOW_CLIENT_CONTRACT_LEG = "ShowClientContractLeg";

   String ADMIN_CONFIG_SHOW_CLIENT_CONTRACT_SHOW_ADDITIONAL_CONTRIBUTE = "AdditionalContribute";

   String ADMIN_CONFIG_SHOW_SUP_CONTRACT_CR = "ShowSupContractCR";

   String ADMIN_CONFIG_SHOW_SUP_CONTRACT_SCOPDOC = "ShowSupContractScopDoc";

   String ADMIN_CONFIG_SHOW_SUP_CONTRACT_LEG = "ShowSupContractLeg";

   String ADMIN_CONFIG_SHOW_PMO_SCOPDOC = "ShowPMOScopDoc";

   String ADMIN_CONFIG_SHOW_PMO_LEG = "ShowPMOLeg";

   String ADMIN_CONFIG_SHOW_PORTFOLIO_CR = "ShowPortfolioCR";

   String ADMIN_CONFIG_SHOW_PORTFOLIO_SCOPDOC = "ShowPortfolioScopDoc";

   String ADMIN_CONFIG_SHOW_PORTFOLIO_LEG = "ShowPortfolioLeg";

   String ADMIN_CONFIG_SHOW_EXTERNAL_SPE_INFO = "ShowSpeInfoExterGroup";

   String OBJ_TYPE_PERFORMANCE_APPRAISAL = "PerformanceApprasial";
   
   String OBJ_TYPE_PERFORMANCE_SCORE_APP = "PerformanceScoreApp";
   
   String OBJ_TYPE_PERFORMANCE_SELF_APP = "PerformanceSelfApp";

   String OBJ_TYPE_LOAN_PURPOSE = "LoanPurpose";

   String OBJ_TYPE_SERVICE_TICKET_CATEGORY = "MsgCategory";
   
   String OBJ_TYPE_SERVICE_TICKET_COMPLAIN_TYPE = "ComplainType";
   
   String OBJ_TYPE_FAILURE_TYPE = "FailureType";
   
   String OBJ_TYPE_WORK_ORDER_TYPE = "WorkOrderType";
   
   String OBJ_TYPE_MATERIAL_STATUS_TYPE = "MaterialStatus"; // Material Status Type

   String OBJ_TYPE_WORK_ORDER = "WorkOrder"; 
   
   String OBJ_TYPE_INVENTORY = "Inventory";

   String OBJ_TYPE_RECEIVE_INVENTORY = "RecInv";

   String OBJ_TYPE_RETURN_INVENTORY = "RetuInv";
   
   String OBJ_TYPE_SERVICE_REFERENCE = "ServiceRef";
   
   String OBJ_TYPE_IPK_STATUS = "IPKStatus";

   String INVENTORY_RELATION_TYPE_M = "Multiple";

   String INVENTORY_RELATION_TYPE_S = "Single";

   String PROGRESS_MEASURE_STAGE_LEAD = "Lead";

   String PROGRESS_MEASURE_STAGE_LEAD_QUALIFIED = "Qualified";

   String OBJ_TYPE_LEAVE = "Leave";

   String OBJ_TYPE_LEAVE_TYPE = "LeaveType";

   String OBJ_TYPE_LEAVE_TYPE_VERSIONS = "LeaveTypeVersions";

   String OBJ_TYPE_COMPENSATION = "Competion";

   String OBJ_TYPE_OFFER = "Offer";

   String OBJ_TYPE_PERFORMANCE = "Performance";

   String USER_CAMPAIGN_AUDIENCE_TYPE = "AudienceType";

   String OBJ_TYPE_EXECUTION_RULE = "ExeRule";

   Integer NOT_NULL_USER_ID = -1000;

   String SYSTEM_SKIN_TYPE_NORMAL = "normal";

   String SYSTEM_SKIN_TYPE_DEMO = "demo";

   String OBJ_TYPE_EMPLOYMENT_POST = "EmploymentPost";

   String OBJ_TYPE_HR_EMPLOYMENT_POST = "EmpPost";

   String OBJ_TYPE_VALUE_RATING = "ValueRating";

   // c0022 - start
   String OBJ_TYPE_VALUE_PARTNER_RATING = "PtnVRating";

   String OBJ_TYPE_VALUE_AGENT_RATING = "AgVRating";

   // c0022 - end
   String OBJ_TYPE_CANDIDATE = "Candidate";

   String OBJ_TYPE_RESUME = "Resume";

   String OBJ_TYPE_CANDIDATE_RESUME = "CandidateResume";

   String OBJ_TYPE_CANDIDATE_RESUMES = "CandidateResumes";

   String OBJ_TYPE_CLIENT_BEHAVIOR = "ClientBehavior";
   
   String OBJ_TYPE_CLIENT_BEHAVIOR_TYPE_TEXT = "Text";

   String OBJ_TYPE_CLIENT_BEHAVIOR_TYPE_NUMBER = "Number";

   String OBJ_TYPE_CLIENT_BEHAVIOR_TYPE_LIST = "List";

   String OBJ_TYPE_CLIENT_BEHAVIOR_TYPE_CHECKBOX = "CheckBox";

   String OBJ_TYPE_CLIENT_BEHAVIOR_TYPE_CHECKBOX_HIERARCHY = "ChBoxHier";
   
   String OBJ_TYPE_FINANCE = "Finance";
   
   String OBJ_TYPE_FINANCE_ITEM = "FinanceItem";
   
   String OBJ_TYPE_VOUCHER_TYPE = "VoucherType";

   String OBJ_TYPE_MYAPPRAISAL = "MyAppraisal";

   String KEY_CLIENT_BEHAVIOR = "clientBehaviorId";

   String KEY_BEHAVIOR_ID = "behaviorValueId";

   Integer CLIENT_BEHAVIOR_REAL_FIELDID_NUMBER = -1000;

   Integer CLIENT_BEHAVIOR_REAL_FIELDID_LIST = -1001;

   Integer CLIENT_BEHAVIOR_REAL_FIELDID_CHECKBOX_LAST_OPTION = -1002;

   Integer CLIENT_BEHAVIOR_REAL_FIELDID_CHECKBOX_HIERARCHY_LAST_OPTION = -1003;

   String CLIENT_BEHAVIOR_REAL_FIELDTYPE_SELECT = "select";

   String CLIENT_BEHAVIOR_REAL_FIELDTYPE_CHECKBOX = "ck";

   String CLIENT_BEHAVIOR_REAL_FIELDTYPE_CHECKBOX_HIERARCHY = "ckh";

   String CLIENT_BEHAVIOR_REAL_FIELDTYPE_NUMBER = "number";

   String CLIENT_BEHAVIOR_REAL_FIELDTYPE_TEXT = "text";
   
   String CLIENT_BEHAVIOR_REAL_FIELDTYPE_TEXTAREA = "textarea";

   String EXTEND_OBJ_TYPE_CANDIDATE_SKILL = "CandSkill";
   
   String EXTEND_OBJ_TYPE_CANDIDATE_USER_DEFINE = "CandUserDef";
   
   String EXTEND_OBJ_TYPE_INTER_USER_SKILL = "InUserSkill";

   String EXTEND_OBJ_TYPE_EXTER_USERE_SKILL = "ExUserSkill";

   String NOTE_KEY = "com.gearteks.framework.common.NOTE";
   
   String NOTE_TYPE = "com.gearteks.framework.common.NOTE.type";
   
   String NOTE_TYPE_COMMON = "com.gearteks.framework.common.NOTE.type.common";

   String OBJ_TYPE_BENEFIT_TYPE_OWNNER_TYPE_BENEFIT_TYPE = "BenefitType";

   String OBJ_TYPE_BENEFIT_TYPE_OWNNER_TYPE_SERVICE_TICKET_SUBMIT = "SubmitType";

   String OBJ_TYPE_BENEFIT_TYPE_OWNNER_TYPE_ACTION_TYPE = "ActionType";

   String CLIENT_BEHAVIOR_REAL_OBJ_TYPE_COMPANY = "Company";

   String CLIENT_BEHAVIOR_REAL_OBJ_TYPE_USER = "User";

   String CLIENT_BEHAVIOR_DEAL_TYPE_IGNORE = "Ignore";

   String CLIENT_BEHAVIOR_DEAL_TYPE_REPLACE = "Replace";

   String CLIENT_BEHAVIOR_DEAL_TYPE_APPEND = "Append";

   String OBJ_TYPE_PRODUCT_INVENTORY = "ProductInventory";
   
   String OBJ_TYPE_PRODUCT_INVENTORY_SHORT = "ProdInv";

   String OBJ_TYPE_BILL_OF_MATERIAL = "BillOfMaterial";

   String OBJ_TYPE_UNLOCK_MATERIAL = "UnlockMaterial";

   String VIEW_GROUP_TYPE_MYSELF = "MySelf";

   String VIEW_GROUP_TYPE_SUBGROUPS = "SubGroups";

   String VIEW_GROUP_TYPE_MYSELF_AND_SUBGROUPS = "MySelfAndSubGroups";

   String INCLUSION_SUBGROUPS = "SubGroups";

   String INCLUSION_SUBGROUPS_AND_OFFSPRING = "SubGroupsAndOffspring";

   String QUOTATION_SETTING_VIEW_PRIVILEGE = "Privilege";

   String QUOTATION_SETTING_VIEW_REMINDER = "Reminder";

   String OBJ_TYPE_SUPPORTMSG = "SupportMsg";
   
   String OBJ_TYPE_APPOINTMENT = "Appointment";
   
   String OBJ_TYPE_COMPLANTS = "Complants";

   String OBJ_TYPE_SUPPORTMSG_ACTION = "SupportMsgAction";

   String OBJ_TYPE_SELF_DEFINED_ACTION = "SelfAction";

   String IS_IN_MOBILE_CONTEXT = "MobileContext";

   String JOB_OLD_PARENT = "JobOldParent";

   String JOB_NEW_PARENT = "JobNewParent";

   String OBJ_TYPE_SCHEDULER_CHAIN = "Chain";

   String OBJ_TYPE_SCHEDULER_PROCESS = "Process";

   String OBJ_TYPE_BENEFIT_PLAN = "BenefitPlan";

   String OBJ_TYPE_BENEFIT_ENROLLMENT = "BenefitEnrollment";

   String OBJ_TYPE_OBJ_SHIPMENT = "OBJShipment";
   
   String OBJ_TYPE_OBJ_SHIPMENT_ITEM = "OBJShipItem";
   
   String OBJ_TYPE_QA_RETURN = "QAReturn";

   String RISK_CRITERION_TYPE_DEFINE = "Define";

   String OBJ_TYPE_IMPORTANCE_LEVEL = "ImportanceLevel";

   String OBJ_TYPE_PAYROLL = "Payroll";

   String OBJ_TYPE_FIELD_PAYROLL_OBJ = "FieldPayrollObj";
   
   String OBJ_TYPE_PAYROLL_CUSTOMIZE_CYCLE_TYPE = "PayrollCustomizeCycleType";
   
   String OBJ_TYPE_PAYROLL_PAYOUT = "Payroll";
   
   String OBJ_TYPE_PAYROLL_TAXATION = "Taxation";
   
   String OBJ_TYPE_SALES_TAX = "SalesTax";
   
   String OBJ_TYPE_HR_BENEFIT_PAY = "HrBenefitPay";

   String OBJ_TYPE_OBJ_EXTEND = "ObjExtend";

   String OBJ_TYPE_OBJ_EXTEND_AREA = "ObjExtendArea";

   String OBJ_TYPE_OBJ_EXTEND_FIELD = "ObjExtendField";

   String OBJ_TYPE_PROBATION = "Probation";

   String BUSINESSTYPE_ENROLLMENT = "Enrollment";

   String BUSINESSTYPE_PAYIN = "Pay-in";

   String BUSINESSTYPE_PAYOUT = "Pay-out";

   String LABOR_CONTRACT = "LaborContract";

   String BULLETIN_ALL = "all";

   String BULLETIN_READ = "read";

   String BULLETIN_UNREAD = "unread";

   String BULLETIN_TERMINATED = "terminated";

   String OBJ_TYPE_ATTENDANCE = "Attendance";

   String OBJ_TYPE_PURCHASEPLAN = "PurchasePlan";
   
   String OBJ_TYPE_PUR_PLAN_ITEM = "PurPlanItem";

   String OBJ_TYPE_PURCHASEPLAN_APPROVAL = "PurPlan";
   
   String OBJ_TYPE_PURCHASEPLAN_COMPARE = "PurPlanCom";
   
   String OBJ_TYPE_STANDING_OFFER_REQUEST = "StandingOR";

   String OBJ_TYPE_EMPTYOBJ = "EmptyObj";

   String OBJ_TYPE_COMPANY_PRODUCT = "CompanyProduct";

   String OBJ_TYPE_PRODUCT_SERIAL = "ProductSerial";
   
   String OBJ_TYPE_MATERIAL_TRANS_PRODUCT = "MatTraPro";
   
   String OBJ_TYPE_PRODUCT_REQFROM_INVENTORY = "ProductReqFromInventory";
   String OBJ_TYPE_REWARD_APPROVAL = "Reward";
   
   String OBJ_TYPE_MEMBERSHIPTRANSACTION_APPROVAL = "MemTransa";
   
   String OBJ_TYPE_MEMBERSHIPTRANSACTION = "MemTransa";
   
   String OBJ_TYPE_MATERIAL_TRANSACTION = "MaterialTrans";
   
   //对应默认部门审批表  DefaultApproverGroup 里的objType 为 136
   String OBJ_TYPE_MATERIAL_TRANS_APPROVAL = "136";
   //入库批号
   String OBJ_TYPE_PRODUCT_SERVICE_BATCH = "BatchNo";
   //出库批号
   String OBJ_TYPE_PRODUCT_SERVICE_BATCH_OUT = "BatchNoOut";
   
   String OBJ_TYPE_PRODUCT_RCVFROM_INVENTORY = "ProductRcvFromInventory";
   
   String OBJ_TYPE_PRODUCT_PRICE_VALID_PERIOD = "ValidPeriod";

   String OBJ_TYPE_STRATEGY_AREA = "StrategyArea";

   String OBJ_TYPE_NAVIGATION = "Navigation";

   String OBJ_TYPE_NAVIGATION_TEMP = "NavigationTemp";

   String OBJ_TYPE_NAVIGATION_NODE = "NavigationNode";
   String OBJ_TYPE_NAVIGATION_NODE_NO_ROLE = "NavigationNodeNoRole";

   String OBJ_TYPE_NAVIGATION_LINE = "NavigationLine";
   
   String OBJ_TYPE_ORGOTHERTYPES = "OrgTypes";
   
   String OBJ_TYPE_EXCHANGE_RATE = "ExchangeRate";

   String OBJ_TYPE_PROJECT_CHARTER = "PrjCht";
   String OBJ_TYPE_PROJECT_CHARTER_ITEM = "PrjChtItm";
   String GROUP_TYPE_INTER_PROJECT_CHARTER_TYPE = "ProjCharType";

   
   // when hql has "in" statement, one query better not exceed the count in all
   // the "in" statement.
   int MAX_IN_SQL_COUNT = 2000;

   // excel中单sheet的最大容量
   int REPORT_MAX_IN_EXCEL_ROWS = 60000;

   // 查询时每页显示的最大值
   int REPORT_MAX_IN_HIBERNATE_ROWS = 10000;

   // 做临时表插入时一次提交的数据量
   int REPROT_MAX_IN_BATCH_SIZE = 10000;

   int MEMBER_COUNT_MAX_SHOW_IN_LIST = 20;

   String OBJ_TYPE_CLIENTREPORT = "ClientRpt";
   String OBJ_TYPE_VALUE_SUPPLIER_RATING = "SupVRating";

   /* RequirementMatix 对象类型 */
   String OBJ_TYPE_REQUIREMENT_MATRIX = "ReqMatrix";

   /* Project Requirement 对象类型 */
   String OBJ_TYPE_PROJECT_REQUIREMENT_SHORT = "ProjReq";
   
   String OBJ_TYPE_PRODUCT_INBOUND = "ProInbound";

   String WEEK = "Week";

   String OBJ_TYPE_PREDICTION = "Prediction";

   String OBJ_TYPE_RATE = "Rate";

   String OBJ_TYPE_SYSTEM_REASON = "SystemReason";

   String OBJ_TYPE_APPRAISAL = "AppraisalAndAssessment";

   String OBJ_TYPE_JOB_STATUS_CHANAGE = "JobStaCha";

   String OBJ_TYPE_QUESETION_ISSUE = "Question";

   String GROUP_TYPE_BULLETIN_TYPE = "BulletinType";

   Integer BULLETIN_TYPE_PROJECT_EVENT = -100330002;
   
   Integer BULLETIN_TYPE_ANNUAL_BUSINESS_PLAN = -101000001;
   
   Integer BULLETIN_TYPE_GROUP_EVENT = -101000002;

   Integer BULLETIN_TYPE_GENERAL = -100;

   String IS_FROM_MOBILE_CLIENT = "isFromMobileClient";
   
   String PLATFORM_NAME = "PlatFormName";
   
   String PLATFORM_ANDROID = "Android";
   
   String PLATFORM_IOS = "iOS";
   
   /* 公告内容类型 */
   String OBJ_TYPE_CONTENT_TYPE = "ContentType";

   String OBJ_TYPE_PRODUCT_REQUEST_FROM_INVENTORY = "ProReqInv";

   String OBJ_TYPE_PRODUCT_RECEIVE_FROM_INVENTORY = "ProRcvInv";

   String OBJ_TYPE_PRODUCT_RETURN_TO_INVENTORY = "ProRtnInv";

   Integer TYPE_NORMAL_ORDER = -200;

   Integer TYPE_SAMPLED_ORDER = -201;
   
   String OBJ_TYPE_LOGISTICS = "Logistics"; //物流单
   
   String OBJ_TYPE_PRO_RECEICED = "ProReceived"; //收货清单
   
   String OBJ_TYPE_PRO_RETURN = "ProReturn"; //退货清单
   
   String OBJ_TYPE_PRO_REC_FROM_INV = "ProRecFrInv"; //自定义编号  调拨入库编号
   
   String OBJ_TYPE_ARRIVAL_NOTICE = "ArrivalNotice";
   
   String OBJ_TYPE_SALES_WEEK_PLAN = "SalesWeek";
   
   String OBJ_TYPE_SALES_WEEK_PLAN_ITEM = "SalesWeekItem"; //销售周计划明细
   
   String GROUP_TYPE_SALES_WEEK_PLAN = "SalesWeek";
   
   String OBJ_TYPE_EMAIL_SEND_EXTEND = "EmailSendExtend";
   
   String OBJ_TYPE_EMAIL_SEND_EXTEND_EMAIL = "ExtendEmail";
   
   String OBJ_TYPE_PREPAYMENT = "Prepayment";
   
   String OBJ_TYPE_SUPPLIER_TYPE = "SupplierType";
   
   String OBJ_TYPE_COMPANY_SURVEY = "CompSurvey";
   String OBJ_TYPE_SERVICE_PLAN = "ServicePlan";
   
   String OBJ_TYPE_PURCHASE_RECEIVED_ITEM = "PORcvItem";
   
   String OBJ_TYPE_PURCHASE_RECEIVED_ITEM_BATCH = "PORcvItemB";
   
   String OBJ_TYPE_ACCEPTANCE = "Acceptance";
   
   // 质检结果
   String OBJ_TYPE_ACCEPTANCE_RESULT = "AcceptanceRs";
   
   String OBJ_TYPE_SEARCH_RULE_SET = "SearchRuleSet";
   
   String OBJ_TYPE_PURCHASE_RECEIVED_INVENTORY = "PORcvInventory";

   String MOBILE_CLIENT_ID = "client_id";
   
   String MOBILE_CLIENT_SECRET = "client_secret";
   
   String OBJ_TYPE_AGENDA = "Agenda";
   
   String OBJ_TYPE_COURSE = "Course";
   
   String GROUP_TYPE_AGENDA = OBJ_TYPE_AGENDA;
   
   String OBJ_TYPE_AGENDADETAIL = "AgendaDetail";

   String OBJ_TYPE_QUESTION = "Question";
   
   String OBJ_TYPE_MEASUREMENT_SET = "MeasurementSet";
   
   String OBJ_TYPE_MEASURE = "Measure";
   
   String OBJ_TYPE_DISPLAY = "Display";
   
   String OBJ_TYPE_PO_DELIVERY_PLAN = "PoDeliveryPlan";
   
   String OBJ_TYPE_PO_DELIVERY_PLAN_ITEM = "PoDeliveryPlanItem";
   
   String COMPANY_INVENTORY = "CompanyInventory";
   
   String OBJ_TYPE_STANDING_OFFER_REQUEST_ITEM = "StandingORIT";
      
   String OBJ_TYPE_STANDING_OFFER_REQUEST_ITEM_COMPARE = "StandingORITC";
   
   String OBJ_TYPE_STANDING_OFFER_REQUEST_QUOTATION = "StandingORQ";
   
   String OBJ_TYPE_STANDING_OFFER_REQUEST_QUOTATION_REQUEST = "StandingORQR";
   //仓库
   String OBJ_TYPE_WAREHOUSE = "WareHouse";
   
   String UI_TABLE_UPDATE_WIDTH = "width";
   
   String UI_TABLE_UPDATE_DISPLAY = "display";
   
   String OBJ_TYPE_BRANCH_ICON = "BranchIcon";
   
   String OBJ_TYPE_COMPANY_ICON = "CompanyIcon";
   
   String OBJ_TYPE_WAREHOUSE_ALERT = "WareHouseAlert";
   
   String OBJ_TYPE_WAREHOUSE_WARRANTY_PERIOD_ALERT_LOG = "wpLog";
   String OBJ_TYPE_WAREHOUSE_SAFE_STOCK_ALERT_LOG = "ssLog";
   String OBJ_TYPE_WAREHOUSE_OVER_STOCK_ALERT_LOG = "osLog";
   
   //浙江合信
   String OBJ_TYPE_REGISTRATION = "Registration";
   
   String OBJ_TYPE_REGISTRATION_ICON = "RegistrationIcon";

   String OBJ_TYPE_REGISTRATION_MERGE_ICON = "RegistrationMergeIcon";
   
   String REVENUE_CANDELETEPROJECT = "Revenue_canDeleteProject";
   
   String REVENUE_GETBY_PROJECTID_TOCOPY = "Revenue_getByProjectIdToCopy";
   
   String OBJ_TYPE_STAFFING_REQUISITION = "StafReq";
   
   String OBJ_TYPE_ATTENDANCE_OVERTIME = "AttOvertime";
   
   String OBJ_TYPE_EQUIPMENT_DRIVING_RECORD = "eqDriRecord";
   
   String OBJ_TYPE_EQUIPMENT_VIOLATION_RECORD = "VioRecord";
   
   String OBJ_TYPE_EQUIPMENT_MAINTENANCE_RECORD = "MainRecord";
   
   String OBJ_EXTEND_OWNERTYPE_CONTRACT = "Contract";
   
   String OBJ_TYPE_WORKLOAD = "Workload";
   
   String OBJ_TYPE_SHIPMENT_ACCEPT = "QShipmentAcpt";
   
   int JOB_CLIENT_EXTEND_FIELD_ID = -100700001;
   
   String OBJ_TYPE_LEAVE_TYPE_CALCULATION = "LeaveTypeCalc";
   
   String OBJ_TYPE_LEAVE_TYPE_CAL_YEAR = "LeaveTypeCalcYear";
   
   String OBJ_TYPE_LEAVE_TYPE_CAL_LEVEL = "LeaveTypeCalcLevel";
   
   String OBJ_TYPE_LEAVE_TYPE_CAL_YEAR_CONTRACT = "LeaveTypeCalcYearCon";
   
   String OBJ_TYPE_LEAVE_ADJUST = "LeaveAdjust";
   
   String OBJ_TYPE_COMMON_GRADE = "CommonGrade";
   
   String OBJ_TYPE_COMMON_GRADE_TYPE = "CommonGradeType";
   
   String OBJ_TYPE_SUBMISSION = "Submission";

   String OBJ_TYPE_WORK_CENTER = "WorkCenter";
   
   String OBJ_TYPE_COMMONGRADE_SERVICERESPONSETIME = "serviceResponseTime";

   String OBJ_TYPE_TEMP_OBJECT = "TempObj";
   
   //质检单号
   String OBJ_TYPE_PRODUCT_ACCEPTANCE_NO = "AccepNo";
   
   String RESPONSE_TIMER_LEVEL_NEVER = "never";
   
   String RESPONSE_TIMER_LEVEL_METHOD = "method";
   
   String RESPONSE_TIMER_LEVEL_PARAMS = "params";
   
   String OBJ_TYPE_COMPANY_CI = "CompanyCI";
   
   String OBJ_TYPE_LOCATION = "Location";
   
   // 排班模版
   String OBJ_TYPE_ROSTER_TEMPLATE = "RosterTemplate";
   
   // 广州千行采购计划提醒
   String OBJ_TYPE_PURCHASEPLAN_NOTICE = "PPlanBase";
   
   //start 自定义字段
   String TEMP_OBJ_TYPE = "TmpObjType";
   
   String TEMP_FIELDNAME = "TempField";
   
   String TEMP_EXTEND_VALUE_ID =  "ExtendValueId";
   
   //end
   
   String OBJ_TYPE_PURCHASEPLAN_CODE = OBJ_TYPE_PURCHASEPLAN_APPROVAL;
   
   String SESSION_ROTATION_ADJUST_LIST = "8thManage.session.rotationAdjust.list";
   
   String OBJ_TYPE_ECOMMERCE_PLATFORM_CERT = "EcommercePlatformCert";
   /**
    * 电商平台
    */
   String OBJ_TYPE_ECOMMERCE_PLATFORM = "EPlatform";
   
   String OBJ_TYPE_ECOMMERCE_FISSIONMARKETING = "FissionMarketing";
   
   String OBJ_TYPE_SYSTEM_CONFIG_CERT = "SystemConfigCert";
   
   String OBJ_TYPE_PRODUCTGROUPLAYOUT = "ProductGroupLayout";
   
   String OBJ_TYPE_PRODUCTGROUP = "ProductGroup";
   
   String OBJ_TYPE_PRODUCTGROUP_ICON = "ProductGroupIcon";

   String OBJ_TYPE_PRODUCT_TYPE_ICON = "ProductTypeIcon";
   
   String OBJ_TYPE_WECHAT_OFFICIAL = "WechatOfficial";
   
   String OBJ_TYPE_WECHAT_OFFICIAL_PIC = "WechatOfficialPic";
   
   String OBJ_TYPE_WECHAT_OFFICIAL_PIC2 = "WechatOfficialPic2";
   
   String OBJ_TYPE_WECHAT_OFFICIAL_PIC_TEMP = "WechatOfficialPicTemp";
   
   String OBJ_TYPE_WECHAT_OFFICIAL_PIC2_TEMP = "WechatOfficialPic2Temp";
   
   String OBJ_TYPE_WECHAT_OFFICIAL_LABEL = "WechatLabel";

   String OBJ_SUBTYPE_SALESORDER_STATUS_CHANGE = "SalesOrderStatusChange";
   
   String OBJ_SALESORDER_DELETE_TYPE = "salesOrderDelete";
   
   String OBJ_TYPE_MICROMALL_PAGE = "MallPage";
   
     // 零售单
   String OBJ_SUBTYPE_SALESORDER = "SalesOrder";
   
   String OBJ_TYPE_WIDGET = "Widget";
   
   String OBJ_TYPE_SOCIAL_SHARING_POST = "SocialSharingPost";
   
   String OBJ_TYPE_SOCIAL_SHARING_LIKE = "SocialSharingLike";
   
   String QUOTATION_ITEM_TYPE_PRODUCT = "Product";
   
   String QUOTATION_ITEM_TYPE_PACKING = "Packing";
   
   //o2o
   String OBJ_SALESORDER_RETURN_FROM_TYPE_O2O = "o2o";
   
   String SESSION_QUOTATION_SALESORDER_LIST = "8thManage.session.quotation.salesOrder.list";
   
   String SALESORDER_LIST = "saleslist";
   
   String COMMONFIELD = "CommonField";
   
   String COMMONFIELD_CLIENTPHONE = "ClientPhone";
   
   String COMPANY_SHOP_PRODUCT_TYPE = "ProductType";
   
   String COMPANY_SHOP_JING_PIAN = "JingPian";
   
   String COMPANY_SHOP_KUANG_XING = "KuangXing";
   
   String OBJ_TYPE_DRS_SALESORDER_CANCEL_REASON="OrderReason";
   String OBJ_SUBTYPE_B2BORDER = "B2BOrder";
   String B2B_ORDER_LIST = "b2borderlist";
   String QUOTATION_SOURCE_OBJTYPE_CLIENT = "Client";
   String QUOTATION_SOURCE_OBJTYPE_SUPPLIER = "Supplier";
   
   String OBJ_TYPE_ECOMMERCE_COMMENT = "EcommerceComment";
   String OBJ_TYPE_ECOMMERCE_REPLY = "EcommerceReply";
   
   String OBJ_TYPE_SALESORDERSHIPMENT="SalesShipment";
   
   String OBJ_TYPE_PRODUCT_GROUP_TAB = "ProductGroupTab";
   
   String OBJ_TYPE_SALES_COMMISSION_DATA = "SalesCommissionData";
   
   String OBJ_TYPE_SALES_COMMISSION_RULE = "SalesComRule";
   
   String OBJ_TYPE_SUPPLIERBRAND = "SuppBrand"; // 供应商品牌
   
   String OBJ_TYPE_STORE = "Store";
   
   String OBJ_TYPE_SUPPLIERBRAND_LOGO = "SupplierBrandLogo";
   
   String OBJ_TYPE_SUPPLIERBRAND_LOGO_TEMP = "SupplierBrandLogoTemp";
   
   String OBJ_TYPE_SUBMISSION_ICON = "SubmissionIcon";
   
   String OBJ_TYPE_SUBMISSION_LOGO = "SubmissionLogo";
   
   String OBJ_TYPE_STOREDECORATION = "StoreDecoration";
   
   String OBJ_TYPE_STOREDECORATION_LOGO = "StoreDecorationLogo";
   
   String GROUPS_TRANSACTIONS_SEARCH_RANGE_EXCLUDE = "Exclude"; //1、查询条件  除了部门与部门之间的交易
   
   String GROUPS_TRANSACTIONS_SEARCH_RANGE_ONLY = "Only"; //2、查询条件  只查询部门与部门之间的交易
   
   String GROUPS_TRANSACTIONS_SEARCH_RANGE_ALL = "All"; //3、查询条件  全部
   
   String TYPE_ENTER_SUPPLIER_MGT_MENU_ACCOUNTSETTING = "accountSetting";
   
   String TYPE_ENTER_SUPPLIER_MGT_MENU_COMMISSIONSETTING = "commissionSetting";
   
   String TYPE_ENTER_SUPPLIER_MGT_MENU_DEPOSIT = "deposit";
   
   String OBJ_TYPE_DEPOSIT = "Deposit";
   String OBJ_TYPE_ROLE = "Role";
   

   String REGISTER_TYPE_QRCODE = "register"; // 注册二维码
   String FOLLOW_TYPE_QRCODE ="follow";  // 关注公众号二维码
   String STATIC_IMG_MAP_URL = "/s/imgs/";
   String W_MAP_URL = "/w";
   String W_TEMPLATE_MAP_URL = W_MAP_URL +"/template";
   String STATIC_MARKETING_DTL_MAP_URI = "/s/FissionMarketing/";

   String OBJ_TYPE_SHOP_BRAND = "ShopBrand"; // 店铺的品牌
   
   String COOKIE_INVITORMEMBERSHIPID  = "invitorMemberShipId";
   String COOKIE_INVITORID  = "invitorId";
   String COOKIE_FISSMARKETINGID = "fissmarketingId";

   String OBJ_TYPE_APPOINTMENT_TYPE = "AppointmentType";
   String OBJ_TYPE_APPOINTMENT_TYPE_TITLE = "AppointTypeTitle";
   
   String OBJ_TYPE_FISSIONMARKETING = "FissionMarketing";
}