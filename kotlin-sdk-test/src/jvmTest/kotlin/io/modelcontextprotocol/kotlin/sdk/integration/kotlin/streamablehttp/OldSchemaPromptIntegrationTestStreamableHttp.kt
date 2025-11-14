package io.modelcontextprotocol.kotlin.sdk.integration.kotlin.streamablehttp

import io.modelcontextprotocol.kotlin.sdk.integration.kotlin.OldSchemaAbstractPromptIntegrationTest

class PromptIntegrationTestStreamableHttp : OldSchemaAbstractPromptIntegrationTest() {
    override val transportKind: TransportKind = TransportKind.STREAMABLE_HTTP_STATELESS
}
