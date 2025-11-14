package io.modelcontextprotocol.kotlin.sdk.integration.kotlin.streamablehttp

import io.modelcontextprotocol.kotlin.sdk.integration.kotlin.OldSchemaAbstractToolIntegrationTest

class ToolIntegrationTestStreamableHttp : OldSchemaAbstractToolIntegrationTest() {
    override val transportKind: TransportKind = TransportKind.STREAMABLE_HTTP_STATELESS
}
