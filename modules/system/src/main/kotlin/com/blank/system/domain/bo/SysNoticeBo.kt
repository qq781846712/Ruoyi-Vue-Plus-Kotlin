package com.blank.system.domain.bo

import com.blank.common.core.xss.Xss
import com.blank.common.mybatis.core.domain.BaseEntity
import com.blank.system.domain.SysNotice
import io.github.linpeilie.annotations.AutoMapper
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

/**
 * 通知公告业务对象 sys_notice
 */
@AutoMapper(target = SysNotice::class, reverseConvertGenerate = false)
class SysNoticeBo : BaseEntity() {
    /**
     * 公告ID
     */
    var noticeId: Long? = null

    /**
     * 公告标题
     */
    @Xss(message = "公告标题不能包含脚本字符")
    var noticeTitle: @NotBlank(
        message = "公告标题不能为空"
    ) @Size(min = 0, max = 50, message = "公告标题不能超过{max}个字符") String? = null

    /**
     * 公告类型（1通知 2公告）
     */
    var noticeType: String? = null

    /**
     * 公告内容
     */
    var noticeContent: String? = null

    /**
     * 公告状态（0正常 1关闭）
     */
    var status: String? = null

    /**
     * 备注
     */
    var remark: String? = null

    /**
     * 创建人名称
     */
    var createByName: String? = null
}
